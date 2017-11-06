package com.question.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.zookeeper.server.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.question.pojo.Course;
import com.question.pojo.Notice;
import com.question.pojo.Teacher;
import com.question.service.CourseService;
import com.question.service.NoticeService;
import com.question.service.TeacherService;



@Controller
public class TeacherController {
	
	@Autowired
	private TeacherService teacherService;
	
	@Autowired
	private CourseService courseService;
	
	@Autowired
	private NoticeService noticeService ;
	
	
	/*跳到前台公告添加页面*/
	@RequestMapping("/toFontNoticeAddTea")
	public String  toFontNoticeAddTea() {
		
		return "font_ntcAddTea";
	}
	
	//添加公告，前台教师发布功能
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/addNoticeTea")
	public String addNoticeTea(Model model, Notice notice,HttpServletRequest request){
		
		Teacher t=(Teacher) request.getSession().getAttribute("teacher");
		
		notice.setNtctime(new Date(System.currentTimeMillis()));
		notice.setTchid(t.getTchid());
		
		//后台管理员添加，同意发布人为管理员，1代表管理员
	//	notice.setTchid((long) 1);
		
		
		noticeService.addNotice(notice);
		
		return "redirect:toFontIndex.action";
	}
	
	
	
	
	/*跳到前台教师登陆页面*/
	@RequestMapping("/toFontLoginTea")
	public String  toFontLoginTea() {
		
		return "font_loginTea";
	}
	
	
	/*跳到后台教师登陆页面*/
	@RequestMapping("/toBackLoginTea")
	public String  toBackLoginTea() {
		
		return "toTeacherLoginPage";
	}
	
	
	/*跳到前台课程添加页面，由教师添加*/
	@RequestMapping("/toFontCourseAddTea")
	public String  toFontCourseAddTea() {
		
		return "font_crsAddTea";
	}
	
	
	
	
	/*前台课程添加功能，把老师id,一块保存由教师添加*/
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/addCourseTea")
	public String addCourseTea(Model model, Course course, HttpServletRequest request,@RequestParam("file") CommonsMultipartFile file ) throws IOException
	{
		
		
		
		System.out.println("---");
		Teacher t=(Teacher) request.getSession().getAttribute("teacher");
		
		String path=request.getSession().getServletContext().getRealPath("/courseUpload");
	    //获取文件名称  
        String fileName = UUID.randomUUID()+file.getOriginalFilename();  
        //写入本地磁盘  
        InputStream is = file.getInputStream();  
        byte[] bs = new byte[1024];  
        int len;  
        String url_path=path + "//"+fileName;
        
        OutputStream os = new FileOutputStream(new File(url_path));  
        while ((len = is.read(bs)) != -1) {  
            os.write(bs, 0, len);  
        }  
        os.close();  
        is.close();  

        course.setCrsurl("courseUpload/"+fileName);
        course.setTchid(t.getTchid());
       System.out.println("----");
        course.setCrstime(new Date(System.currentTimeMillis()));
        
		//}
        courseService.addCourse(course);
		
		
		return "redirect:toFontIndex.action";
	}
	
	
	
	@RequestMapping("/question/getTeacherById")
	
	public Teacher getTeacherById(@PathVariable Long tchid ) {
		Teacher Teacher=teacherService.getTeacherById(tchid);
		return Teacher;
	}
	
	@RequestMapping("/question/listTeacher")
	
	public String listTeacher(Model model,
			@RequestParam(required=true,defaultValue="1") Integer page,
            @RequestParam(required=false,defaultValue="10") Integer pageSize){
		PageHelper.startPage(page, pageSize);
		
		System.out.println("123");
		List<Teacher> listTeacher=teacherService.findTeacherList();
		
		PageInfo<Teacher> p=new PageInfo<Teacher>(listTeacher);
		
		model.addAttribute("listTeacher",listTeacher);
		model.addAttribute("page", p);
		return "listTeacher";
	}
	
	
	
	
	
	@RequestMapping("/toAddTeacher")
	public String toAddTeacher() {
		
		return "toAddTeacher";
	}
	
	
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/addTeacher")
	public String addTeacher(Teacher teacher){
		teacherService.addTeacher(teacher);
		
		return "redirect:toBackLoginTea.action";
	}
	
	
	/**
	 * list
	 * <p>Title: queryAllProxy</p>
	 * <p>Description: </p>
	 * @param m
	 * @param request
	 * @param response
	 * @return
	 */
	
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/listTeacher", method = {RequestMethod.POST,RequestMethod.GET })
    public ModelAndView queryAllProxy(Model m,HttpServletRequest request,HttpServletResponse response){
        String pageNum = request.getParameter("pageNum");
        String pageSize =request.getParameter("pageSize");
        int num = 1;
        int size = 3;
        if (pageNum != null && !"".equals(pageNum)) {
            num = Integer.parseInt(pageNum);
        }   
        if (pageSize != null && !"".equals(pageSize)) {
            size = Integer.parseInt(pageSize);
        }
        PageHelper.startPage(num, size);
        List<Teacher> listTeacher=teacherService.findTeacherList();
        
        PageInfo<Teacher> pagehelper = new PageInfo<Teacher>(listTeacher);
        
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("pagehelper", pagehelper);
        
        modelAndView.setViewName("listTeacher");
        return modelAndView;
    }
	
	/**
	 * to 
	 * <p>Title: toModifyTeachers</p>
	 * <p>Description: </p>
	 * @param TeacherId
	 * @return
	 */
	
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/toModifyTeacher")
	public String toModifyTeacher(Model model, @RequestParam(value = "tchid", required = true)  Long tchid){
		Teacher teacher=teacherService.getTeacherById(tchid);
		model.addAttribute("teacher", teacher);
		return "toModifyTeacher";
	}
	
	
	/**
	 * 删除
	 * <p>Title: delTeacher</p>
	 * <p>Description: </p>
	 * @param TeacherId
	 * @return
	 */
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/delTeacher", method = {RequestMethod.POST,RequestMethod.GET })
	public String delTeacher(@RequestParam(value = "tchid", required = true)  Long tchid){
		Teacher Teacher=teacherService.getTeacherById(tchid);
		teacherService.deleteTeacher(tchid);
		return "redirect:listTeacher.action";
		
		//"redirect:listTeacher.action"
	}
	
	
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/updateTeacher")
	public String updateTeacher(Teacher teacher){
		System.out.println("123");
		
		teacherService.updateTeacher(teacher);
		return "redirect:listTeacher.action";
	}
	
	
	
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/tlogin")
	public String tlogin(Model model, Teacher teacher,HttpServletRequest request,HttpServletResponse response){
		System.out.println("----");
		Teacher Teachers=teacherService.getTeacherByTeacherAndPassword(teacher);
		
		if(null!=Teachers){
			request.getSession().setAttribute("teacher", Teachers);
			return "adminIndex";
		}else{
			model.addAttribute("msg", "用户名或者密码错误！");
			return "toTeacherLoginPage";
		}
		
	}
	
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/tlogout")
	public String tlogout(Model model, Teacher teacher,HttpServletRequest request,HttpServletResponse response){
		
		request.getSession().removeAttribute("teacher");
		
		return "toAdminLoginPage";
		
	}
	
	

	
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/tupdatePassword")
	public String tupdatePassword( Teacher teacher,HttpServletRequest request,HttpServletResponse response){
		
		Teacher teacher2=(Teacher) request.getSession().getAttribute("teacher");
		String oldpassword=request.getParameter("oldpassword");
		
		if(!teacher2.getTchpwd().equals(oldpassword)){
			request.setAttribute("msg", "原密码输入的不对！");
			return "toModifyPassword";
		}
		teacher2.setTchpwd(teacher.getTchpwd());
		teacherService.updateTeacher(teacher2);
		
		return "index";
		
	}
	
	
	
}
