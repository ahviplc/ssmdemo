package com.question.service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.http.conn.ssl.PrivateKeyStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.utils.IDUtils;
import com.question.mapper.CourseMapper;
import com.question.pojo.Course;
import com.question.pojo.CourseExample;
import com.question.pojo.CourseExample.Criteria;
import com.question.service.CourseService;


@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseMapper courseMapper;


	public void addCourse(Course course) {
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		course.setCrseid(IDUtils.genItemId());
		//course.setCrstime(new Date(System.currentTimeMillis()));
		courseMapper.insert(course);
		
	}


	public List<Course> findCourseList() {
		CourseExample courseExample=new CourseExample();
		List<Course> list=courseMapper.selectByExample(courseExample);
		
		return list;
	}

	
	public Course getCourseById(Long crseid) {
		Course c= courseMapper.selectByPrimaryKey(crseid);
		return c;
	}

	
	public void delete(Long crseid) {
		courseMapper.deleteByPrimaryKey(crseid);
		
	}


	public void updateCourse(Course course) {
		courseMapper.updateByPrimaryKey(course);
		
	}

	//前台模糊查询 课件资源
	public List<Course> findCourseByTopic(String crstopic) {
		
		CourseExample courseExample =new CourseExample ();
		
		Criteria criteria=courseExample.createCriteria();
		criteria.andCrstopicLike("%"+crstopic+"%");
		
		
		
		Course u=null;
		
		List<Course> courseList=courseMapper.selectByExample(courseExample);
		
		if(null!=courseList&&courseList.size()>0){
			u=courseList.get(0);
		}
		return courseList;
	}
	
	
	
}
