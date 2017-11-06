package com.question.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.http.conn.ssl.PrivateKeyStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.utils.IDUtils;
import com.question.mapper.ReplyMapper;
import com.question.pojo.Reply;
import com.question.pojo.ReplyExample;
import com.question.service.ReplyService;




@Service
public class ReplyServiceImpl implements ReplyService {

	@Autowired
	private ReplyMapper replyMapper;

	@Override
	public void addReply(Reply reply) {
		
		reply.setReplyid(IDUtils.genItemId());
		reply.setReplytime(new Date());
		replyMapper.insert(reply);
		
	}

	@Override
	public List<Reply> findReplyList() {
		ReplyExample replyExample=new ReplyExample();
		List<Reply> list=replyMapper.selectByExample(replyExample);
		
		return list;
	}

	@Override
	public Reply getReplyById(Long replyid) {
		Reply c= replyMapper.selectByPrimaryKey(replyid);
		return c;
	}

	@Override
	public void delete(Long replyid) {
		replyMapper.deleteByPrimaryKey(replyid);
		
	}

	@Override
	public void updateReply(Reply reply) {
		replyMapper.updateByPrimaryKey(reply);
		
	}
	
	
	
	
}
