package com.question.service;

import java.util.List;

import com.question.pojo.Notice;




public interface NoticeService {

	void addNotice(Notice notice);

	List<Notice> findNoticeList();

	Notice getNoticeById(Long ntcid);

	void delete(Long ntcid);

	void updateNotice(Notice notice);

	
	

}
