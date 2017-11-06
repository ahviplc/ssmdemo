package com.question.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.question.pojo.Course;
import com.question.pojo.Notice;
import com.question.pojo.Reply;
import com.question.pojo.Student;
import com.question.pojo.Teacher;
import com.question.service.CourseService;
import com.question.service.NoticeService;
import com.question.service.ReplyService;
import com.question.service.StudentService;


@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private CourseService courseService;
	
	@Autowired
	private NoticeService noticeService;
	
	@Autowired
	private ReplyService replyService;
	
	
	/*跳到视频播放界面*/
	@RequestMapping("/toFontCrsVideoPage")
	public ModelAndView  toFontCrsVideoPage(Model model,Course course,HttpServletRequest request,HttpServletResponse response, @RequestParam(value = "crseid", required = true)  Long crseid) {
		System.out.println("---");
		 ModelAndView modelAndView = new ModelAndView();	
		
		Course crs=courseService.getCourseById(crseid);
		modelAndView.addObject("crseidBean",crs.getCrseid());
		modelAndView.addObject("crstopicBean",crs.getCrstopic());
		modelAndView.addObject("crsdescribeBean",crs.getCrsdescribe());
		modelAndView.addObject("crstimeBean",crs.getCrstime());
		modelAndView.addObject("crsurlBean",crs.getCrsurl());
		
		 modelAndView.setViewName("font_crsVideoPage");	   
	        return modelAndView;
		
	}
	
	
	
	
	
	
	//学生查看评论  页面 ，不传值
	
	@RequestMapping("/toFontReplyPageSee")
	public ModelAndView  toFontReplyPageSee(Model m,HttpServletRequest request,HttpServletResponse response) {
		
		System.out.println("-----");
		
		 String pageNum = request.getParameter("pageNum");
	        String pageSize =request.getParameter("pageSize");
	        int num = 1;
	        int size = 5;
	        if (pageNum != null && !"".equals(pageNum)) {
	            num = Integer.parseInt(pageNum);
	        }   
	        if (pageSize != null && !"".equals(pageSize)) {
	            size = Integer.parseInt(pageSize);
	        }
	        PageHelper.startPage(num, size);
		
		 ModelAndView modelAndView = new ModelAndView();	
		 List<Reply> replyList=replyService.findReplyList();
		   PageInfo<Reply> pagehelper = new PageInfo<Reply>(replyList);
		 
		   modelAndView.addObject("replyList",replyList);
		   modelAndView.addObject("pagehelper",pagehelper);
		  
		  modelAndView.setViewName("font_replyPageSee");	   
	        return modelAndView;
	}
	
	
	
	
	//跳到评价课件-页面-评价，传课程资源ID，此为跳转到评论页面
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/toFontReplyPage", method = {RequestMethod.POST,RequestMethod.GET })
	public ModelAndView  toFontReplyPage(Model model,Reply reply,HttpServletRequest request,HttpServletResponse response, @RequestParam(value = "crseid", required = true)  Long crseid) {
		
		System.out.println("------");
		ModelAndView modelAndView = new ModelAndView();
		
		
		Course cou=courseService.getCourseById(crseid);
		
		
		Student stu=(Student) request.getSession().getAttribute("student");
		
		
		 List<Reply> replyList= replyService.findReplyList();
		 
	
		 	  
		  modelAndView.addObject("coutopic", cou.getCrstopic());
		  
		  modelAndView.addObject("stuName", stu.getStuname());
	        
		  modelAndView.addObject("crseId", cou.getCrseid());
		  modelAndView.addObject("replyList",replyList);
		
	        
		  modelAndView.setViewName("font_replyPage");
	        
	   
	        return modelAndView;
		
		
	}
	
	//做出评论，功能
	
	@SuppressWarnings("unchecked")
   
	@RequestMapping(value="/addReplyStu", method = {RequestMethod.POST,RequestMethod.GET })
	public ModelAndView addReplyStu(Model model, Reply reply,HttpServletRequest request,HttpServletResponse response,@RequestParam(value = "crseid", required = true) Long crseid){
		
		System.out.println("-----");
		
		 String pageNum = request.getParameter("pageNum");
	        String pageSize =request.getParameter("pageSize");
	        int num = 1;
	        int size = 5;
	        if (pageNum != null && !"".equals(pageNum)) {
	            num = Integer.parseInt(pageNum);
	        }   
	        if (pageSize != null && !"".equals(pageSize)) {
	            size = Integer.parseInt(pageSize);
	        }
	        PageHelper.startPage(num, size);
		
		 ModelAndView modelAndView = new ModelAndView();
		
		Student student=(Student) request.getSession().getAttribute("student");
		
		Course cou=courseService.getCourseById(crseid);
		
		reply.setContent(reply.getContent());
		reply.setStuid(student.getStuname());
		reply.setReplytime(new Date(System.currentTimeMillis()));
		reply.setCrseid(cou.getCrstopic());
		//replyId在后面service生成
		replyService.addReply(reply);
		
		 List<Reply> replyList=replyService.findReplyList();
		 
		 
		 PageInfo<Reply> pagehelper = new PageInfo<Reply>(replyList);
         
		 modelAndView.addObject("coutopic", cou.getCrstopic());
		  
		  modelAndView.addObject("stuName", student.getStuname());
		
		  modelAndView.addObject("replyList",replyList);
		  
		 modelAndView.addObject("crseId", cou.getCrseid());
		 modelAndView.addObject("pagehelper", pagehelper);
		
		 modelAndView.setViewName("font_replyPage");
	        
		   
	        return modelAndView;
	
	}
	
	
	
	/*前台学生-自注册功能*/
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/fontAddStudent")
	public String fontAddStudent(Model model,Student student){
		System.out.println("--");
		studentService.addStudent(student);
		model.addAttribute("msg", "注册成功，请登录！");
		return "font_login";
	}
	
	

	
	
	/*跳到前台首页*/
	
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/toFontIndex", method = {RequestMethod.POST,RequestMethod.GET })
    public ModelAndView toFontIndex(Model m,HttpServletRequest request,HttpServletResponse response){
        String pageNum = request.getParameter("pageNum");
        String pageSize =request.getParameter("pageSize");
        int num = 1;
        int size = 5;
        if (pageNum != null && !"".equals(pageNum)) {
            num = Integer.parseInt(pageNum);
        }   
        if (pageSize != null && !"".equals(pageSize)) {
            size = Integer.parseInt(pageSize);
        }
        PageHelper.startPage(num, size);
        
        List<Course> list=courseService.findCourseList();
        
        
        PageInfo<Course> pagehelper = new PageInfo<Course>(list);
        
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("pagehelper", pagehelper);
        
        
        //公告信息查出并且在前台显示
        List<Notice> noticelist=noticeService.findNoticeList();
       
        modelAndView.addObject("noticelist", noticelist);
        
        modelAndView.setViewName("font_index");
        
   
        return modelAndView;
    }
	
	/*跳到后台学生登陆页面*/
	@RequestMapping("/toBackLoginStu")
	public String  toBackLoginStu() {
		
		return "toStudentLoginPage";
	}
	
	/*跳到前台学生登陆页面*/
	@RequestMapping("/toFontLogin")
	public String  toFontLogin() {
		
		return "font_login";
	}
	
	/*跳到前台注册页面*/
	@RequestMapping("/toFontRegist")
	public String  toFontRegist() {
		
		return "font_regist";
	}
	
	
	
	
	
	
	
	
	@RequestMapping("/question/getStudentById")
	public Student getStudentById(@PathVariable Long stuid ) {
		Student student=studentService.getStudentById(stuid);
		return student;
	}
	
	@RequestMapping("/question/listStudent")
	
	public String listStudent(Model model,
			@RequestParam(required=true,defaultValue="1") Integer page,
            @RequestParam(required=false,defaultValue="10") Integer pageSize){
		PageHelper.startPage(page, pageSize);
		
		System.out.println("123");
		List<Student> listStudent=studentService.findStudentList();
		
		PageInfo<Student> p=new PageInfo<Student>(listStudent);
		
		model.addAttribute("listStudent",listStudent);
		model.addAttribute("page", p);
		return "listStudent";
	}
	
	
	
	
	
	@RequestMapping("/toAddStudent")
	public String  toAddStudent() {
		
		return "toAddStudent";
	}
	
	
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/addStudent")
	public String addStudent(Student student){
		System.out.println("--");
		studentService.addStudent(student);
		
		return "redirect:listStudent.action";
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
    @RequestMapping(value="/listStudent", method = {RequestMethod.POST,RequestMethod.GET })
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
        List<Student> listStudent=studentService.findStudentList();
        
        PageInfo<Student> pagehelper = new PageInfo<Student>(listStudent);
        
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("pagehelper", pagehelper);
        
        modelAndView.setViewName("listStudent");
        return modelAndView;
    }
	
	/**
	 * to 
	 * <p>Title: toModifyStudents</p>
	 * <p>Description: </p>
	 * @param StudentId
	 * @return
	 */
	
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/toModifyStudent")
	public String toModifyStudent(Model model, @RequestParam(value = "stuid", required = true)  Long stuid){
		Student student=studentService.getStudentById(stuid);
		model.addAttribute("student", student);
		return "toModifyStudent";
	}
	
	
	/**
	 * 删除
	 * <p>Title: delStudent</p>
	 * <p>Description: </p>
	 * @param StudentId
	 * @return
	 */
	
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/delStudent", method = {RequestMethod.POST,RequestMethod.GET })
	public String delStudent(@RequestParam(value = "stuid", required = true)  Long stuid){
		Student student=studentService.getStudentById(stuid);
		studentService.deleteStudent(stuid);
		return "redirect:listStudent.action";
		
		//"redirect:listStudent.action"
	}
	
	
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/updateStudent")
	public String updateStudent(Student student){
		System.out.println("123");
	/*	Student stu=studentService.getStudentById(student.getStuid());
		stu.setStuloginname(student.getStuloginname());
		stu.setStuname(student.getStuname());
		stu.setStupwd(student.getStupwd());*/
		studentService.updateStudent(student);
		
		return "redirect:listStudent.action";
	}
	
	
	
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/slogin")
	public String slogin(Model model, Student student,HttpServletRequest request,HttpServletResponse response){
		System.out.println("-----");
		Student students=studentService.getStudentByStudentAndPassword(student);
		
		if(null!=students){
			request.getSession().setAttribute("student", students);
			return "redirect:adminIndex.action";
		}else{
			model.addAttribute("msg", "用户名或者密码错误！");
			return "toStudentLoginPage";
		}
		
	}
	
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/slogout")
	public String slogout(Model model, Student student,HttpServletRequest request,HttpServletResponse response){
		
		request.getSession().removeAttribute("student");
		
		return "toAdminLoginPage";
		
	}
	
	

	
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/supdatePassword")
	public String supdatePassword( Student student,HttpServletRequest request,HttpServletResponse response){
		
		Student student2=(Student) request.getSession().getAttribute("Student");
		String oldpassword=request.getParameter("oldpassword");
		
		if(!student2.getStupwd().equals(oldpassword)){
			request.setAttribute("msg", "原密码输入的不对！");
			return "toModifyPassword";
		}
		student2.setStupwd(student.getStupwd());
		studentService.updateStudent(student2);
		
		return "index";
		
	}
	
	
	
}
