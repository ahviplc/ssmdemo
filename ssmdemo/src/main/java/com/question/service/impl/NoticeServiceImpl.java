package com.question.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.http.conn.ssl.PrivateKeyStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.utils.IDUtils;
import com.question.mapper.NoticeMapper;
import com.question.pojo.Notice;
import com.question.pojo.NoticeExample;
import com.question.service.NoticeService;



@Service
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	private NoticeMapper noticeMapper;

	@Override
	public void addNotice(Notice notice) {
		
		notice.setNtcid(IDUtils.genItemId());
		notice.setNtctime(new Date());
		noticeMapper.insert(notice);
		
	}

	@Override
	public List<Notice> findNoticeList() {
		NoticeExample noticeExample=new NoticeExample();
		List<Notice> list=noticeMapper.selectByExample(noticeExample);
		
		return list;
	}

	@Override
	public Notice getNoticeById(Long ntcid) {
		Notice c= noticeMapper.selectByPrimaryKey(ntcid);
		return c;
	}

	@Override
	public void delete(Long ntcid) {
		noticeMapper.deleteByPrimaryKey(ntcid);
		
	}

	@Override
	public void updateNotice(Notice notice) {
		noticeMapper.updateByPrimaryKey(notice);
		
	}
	
	
	
}
