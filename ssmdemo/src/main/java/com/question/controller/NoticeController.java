package com.question.controller;

import java.util.Date;
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
import com.question.pojo.Notice;
import com.question.service.NoticeService;


@Controller
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/toAddNotice")
	public String toAddNotice(Model model){
		
		return "toAddNotice";
	}
	
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/addNotice")
	public String addNotice(Model model, Notice notice){
		notice.setNtctime(new Date(System.currentTimeMillis()));
		
		//后台管理员添加，同意发布人为管理员，1代表管理员
		notice.setTchid((long) 1);
		
		
		noticeService.addNotice(notice);
		
		return "redirect:listNotice.action";
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
    @RequestMapping(value="/listNotice", method = {RequestMethod.POST,RequestMethod.GET })
    public ModelAndView listNotice(Model m,HttpServletRequest request,HttpServletResponse response){
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
        
        List<Notice> list=noticeService.findNoticeList();
        
        
        PageInfo<Notice> pagehelper = new PageInfo<Notice>(list);
        
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("pagehelper", pagehelper);
        
        modelAndView.setViewName("listNotice");
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
    @RequestMapping(value="/toModifyNotice")
	public String toModifyNotice(Model model, @RequestParam(value = "ntcid", required = true)  Long ntcid){
		
		Notice notice=noticeService.getNoticeById(ntcid);
		
		model.addAttribute("notice", notice);
		return "toModifyNotice";
	}
	
	
	/**
	 * 删除
	 * <p>Title: delUser</p>
	 * <p>Description: </p>
	 * @param userId
	 * @return
	 */
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/delNotice", method = {RequestMethod.POST,RequestMethod.GET })
	public String delNotice(@RequestParam(value = "ntcid", required = true)  Long ntcid){
		noticeService.delete(ntcid);
		return "redirect:listNotice.action";
		
	}
	
	
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/updateNotice")
	public String updateNotice(Notice notice){
		System.out.println("----");
	//	Notice c=noticeService.getNoticeById(notice.getNtcid());
		//Notice.setCdate(c.getCdate());
		notice.setNtctime(new Date(System.currentTimeMillis()));
		noticeService.updateNotice(notice);
		
		return "redirect:listNotice.action";
	}
	
	
}
