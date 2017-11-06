package com.question.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.question.pojo.Admin;
import com.question.service.AdminService;


@Controller
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	
	@SuppressWarnings("unchecked")
	 @RequestMapping(value="/adminIndex")
	public String adminIndex(Model model){
		System.out.println("dduu");
		return "adminIndex";
	}
	
	@SuppressWarnings("unchecked")
	 @RequestMapping(value="/toAdminLoginPage")
	public String toAdminLoginPage(Model model){
		System.out.println("dduu");
		return "toAdminLoginPage";
	}
	
	
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/toAddAdmin")
	public String toAddAdmin(Model model){
		
		return "toAddAdmin";
	}
	
	
	/*注册用了*/
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/addAdmin")
	public String addAdmin(Model model, Admin admin){
		
		adminService.addAdmin(admin);
		model.addAttribute("regSuMsg", "注册成功，请登录！");
		return "toAdminLoginPage";
	}
	
	
/*	后台管理，添加管理员方法*/
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/add2Admin")
	public String add2Admin(Model model, Admin admin){
		
		adminService.addAdmin(admin);
		
		return "redirect:listAdmin.action";
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
    @RequestMapping(value="/listAdmin", method = {RequestMethod.POST,RequestMethod.GET })
    public ModelAndView listAdmin(Model m,HttpServletRequest request,HttpServletResponse response){
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
        
        List<Admin> list=adminService.findAdminList();
        
        
        PageInfo<Admin> pagehelper = new PageInfo<Admin>(list);
        
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("pagehelper", pagehelper);
        
        modelAndView.setViewName("listAdmin");
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
    @RequestMapping(value="/toModifyAdmin")
	public String toModifyAdmin(Model model, @RequestParam(value = "admid", required = true)  Long admid){
		
		Admin admin=adminService.getAdminById(admid);
		
		model.addAttribute("admin", admin);
		System.out.println("=====");
		return "toModifyAdmin";
	}
	
	
	/**
	 * 删除
	 * <p>Title: delUser</p>
	 * <p>Description: </p>
	 * @param userId
	 * @return
	 */
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/delAdmin", method = {RequestMethod.POST,RequestMethod.GET })
	public String delAdmin(@RequestParam(value = "admid", required = true)  Long admid){
		adminService.delete(admid);
		return "redirect:listAdmin.action";
		
	}
	
	
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/updateAdmin")
	public String updateAdmin(Admin admin){
		
		Admin c=adminService.getAdminById(admin.getAdmid());
		
		adminService.updateAdmin(admin);
		return "redirect:listAdmin.action";
	}
	
	
	
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/alogin")
	public String alogin(Model model, Admin admin,HttpServletRequest request,HttpServletResponse response){
		
		System.out.println("-----");
		System.out.println("e");
		Admin admins=adminService.getAdminByAdminAndPassword(admin);
	
		if(null!=admins){
			
			request.getSession().setAttribute("admin", admins);
			return "adminIndex";
		}else{
			model.addAttribute("msg", "用户名或者密码错误！");
			return "toAdminLoginPage";
		}
		
	}
	
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/alogout")
	public String alogout(Model model, Admin admin,HttpServletRequest request,HttpServletResponse response){
		
		request.getSession().removeAttribute("admin");
		
		return "toAdminLoginPage";
		
	}
	
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/aupdatePassword")
	public String aupdatePassword( Admin admin,HttpServletRequest request,HttpServletResponse response){
		
		Admin admin2=(Admin) request.getSession().getAttribute("admin");
		String oldpassword=request.getParameter("oldpassword");
		
		if(!admin2.getAdmpwd().equals(oldpassword)){
			request.setAttribute("msg", "原密码输入的不对！");
			return "toModifyPassword";
		}
		admin2.setAdmpwd(admin.getAdmpwd());
		adminService.updateAdmin(admin2);
		
		return "adminIndex";
		
	}

}
