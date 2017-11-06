package com.question.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.utils.IDUtils;
import com.question.mapper.TeacherMapper;
import com.question.pojo.Teacher;
import com.question.pojo.TeacherExample;
import com.question.pojo.TeacherExample.Criteria;
import com.question.service.TeacherService;


@Service
public class TeacherServiceImpl implements TeacherService{

	@Autowired
	private TeacherMapper teacherMapper;

	@Override
	public Teacher getTeacherById(Long tchid) {
		Teacher teacher=teacherMapper.selectByPrimaryKey(tchid);
		return teacher;
	}

	@Override
	public List<Teacher> findTeacherList() {
		TeacherExample example=new TeacherExample();
		List<Teacher> list=teacherMapper.selectByExample(example);
		
		return list;
	}

	@Override
	public void addTeacher(Teacher teacher) {
		teacher.setTchid(IDUtils.genItemId());
		//user.setCredatedate(new Date());
		//user.setState("0");
		teacherMapper.insert(teacher);
		
	}

	@Override
	public void deleteTeacher(Long tchid) {
		teacherMapper.deleteByPrimaryKey(tchid);
		
	}

	@Override
	public void updateTeacher(Teacher teacher) {
		teacherMapper.updateByPrimaryKey(teacher);
		
	}

	@Override
	public Teacher getTeacherByTeacherAndPassword(Teacher teacher) {
		TeacherExample teacherExample=new TeacherExample();
		
		Criteria criteria=teacherExample.createCriteria();
		criteria.andTchloginnameEqualTo(teacher.getTchloginname());
		criteria.andTchpwdEqualTo(teacher.getTchpwd());
		
		Teacher u=null;
		
		List<Teacher> teacherList=teacherMapper.selectByExample(teacherExample);
		if(null!=teacherList&&teacherList.size()>0){
			u=teacherList.get(0);
		}
		return u;
	}

	
	
}
