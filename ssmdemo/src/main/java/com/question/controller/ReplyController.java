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
import com.question.pojo.Reply;
import com.question.service.ReplyService;


@Controller
public class ReplyController {
	
	@Autowired
	private ReplyService replyService;
	
	
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/toAddReply")
	public String toAddReply(Model model){
		
		return "toAddReply";
	}
	
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/addReply")
	public String addReply(Model model, Reply reply){
		
		replyService.addReply(reply);
		
		return "redirect:listReply.action";
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
    @RequestMapping(value="/listReply", method = {RequestMethod.POST,RequestMethod.GET })
    public ModelAndView listReply(Model m,HttpServletRequest request,HttpServletResponse response){
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
        
        List<Reply> list=replyService.findReplyList();
        
        
        PageInfo<Reply> pagehelper = new PageInfo<Reply>(list);
        
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("pagehelper", pagehelper);
        
        modelAndView.setViewName("listReply");
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
    @RequestMapping(value="/toModifyReply")
	public String toModifyReply(Model model, @RequestParam(value = "replyid", required = true)  Long replyid){
		
		Reply reply=replyService.getReplyById(replyid);
		
		model.addAttribute("reply", reply);
		return "toModifyReply";
	}
	
	
	/**
	 * 删除
	 * <p>Title: delUser</p>
	 * <p>Description: </p>
	 * @param userId
	 * @return
	 */
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/delReply", method = {RequestMethod.POST,RequestMethod.GET })
	public String delReply(@RequestParam(value = "replyid", required = true)  Long replyid){
		replyService.delete(replyid);
		return "redirect:listReply.action";
		
	}
	
	
	@SuppressWarnings("unchecked")
    @RequestMapping(value="/updateReply")
	public String updateReply(Reply reply){
		
		Reply c=replyService.getReplyById(reply.getReplyid());
		//Reply.setCdate(c.getCdate());
		replyService.updateReply(reply);
		return "redirect:listReply.action";
	}
	
	
}
