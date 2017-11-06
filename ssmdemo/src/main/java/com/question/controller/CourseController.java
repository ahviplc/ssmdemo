package com.question.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.question.pojo.Course;
import com.question.pojo.Notice;
import com.question.service.CourseService;
import com.question.service.NoticeService;


@Controller
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@Autowired
	private NoticeService noticeService;
	
	
	

	@SuppressWarnings("unchecked")
    @RequestMapping(value="/toAddCourse")
	public String toAddCourse(Model model){
		
		return "toAddCourse";
	}
	
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/addCourse")
	public String addCourse(Model model, Course course, HttpServletRequest request,@RequestParam("file") CommonsMultipartFile file ) throws IOException
	{
		
		System.out.println("---");
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
        
        
		//}
        courseService.addCourse(course);
		
		
		return "redirect:listCourse.action";
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
    @RequestMapping(value="/listCourse", method = {RequestMethod.POST,RequestMethod.GET })
    public ModelAndView listCourse(Model m,HttpServletRequest request,HttpServletResponse response){
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
        
        List<Course> list=courseService.findCourseList();
        
        
        PageInfo<Course> pagehelper = new PageInfo<Course>(list);
        
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("pagehelper", pagehelper);
        
        modelAndView.setViewName("listCourse");
        return modelAndView;
    }
	
	/**
	 * to 
	 * <p>Title: toModifyUsers</p>
	 * <p>Description: </p>
	 * @param userId
	 * @return
	 */
	
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/toModifyCourse")
	public String toModifyCourse(Model model, @RequestParam(value = "crseid", required = true)  Long crseid){
		
		Course course=courseService.getCourseById(crseid);
		
		model.addAttribute("course", course);
		return "toModifyCourse";
	}
	
	
	/**
	 * 删除
	 * <p>Title: delUser</p>
	 * <p>Description: </p>
	 * @param userId
	 * @return
	 */
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/delCourse", method = {RequestMethod.POST,RequestMethod.GET })
	public String delCourse(@RequestParam(value = "crseid", required = true)  Long crseid){
		courseService.delete(crseid);
		return "redirect:listCourse.action";
		
	}
	
	
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/updateCourse")
	public String updateCourse(Course course ,Model model,HttpServletRequest request,@RequestParam("file") CommonsMultipartFile file) throws IOException {
		System.out.println("----");
		//重新上传图片
				if(null!=file&&file.getOriginalFilename().length()>0){
					
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
				}else{
					Course course2=courseService.getCourseById(course.getCrseid());
					course.setCrsurl(course2.getCrsurl());
				}
				
			
				
				courseService.updateCourse(course);
		
		
		
		
		
		//Course c=courseService.getCourseById(course.getCrseid());
		//course.setCdate(c.getCdate());
		//courseService.updateCourse(course);
		return "redirect:listCourse.action";
	}
	
	
}
