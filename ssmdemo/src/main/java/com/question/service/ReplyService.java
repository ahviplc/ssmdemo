package com.question.service;

import java.util.List;

import com.question.pojo.Notice;
import com.question.pojo.Reply;




public interface ReplyService {

	void addReply(Reply reply);

	List<Reply> findReplyList();

	Reply getReplyById(Long replyid);

	void delete(Long replyid);

	void updateReply(Reply reply);

	

	
	

}
