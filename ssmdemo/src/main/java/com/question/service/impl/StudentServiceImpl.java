package com.question.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.utils.IDUtils;
import com.question.mapper.StudentMapper;

import com.question.pojo.Student;
import com.question.pojo.StudentExample;

import com.question.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentMapper studentMapper;

	@Override
	public Student getStudentById(Long stuid) {
		Student student=studentMapper.selectByPrimaryKey(stuid);
		return student;
	}

	@Override
	public List<Student> findStudentList() {
		StudentExample example=new StudentExample();
		List<Student> list=studentMapper.selectByExample(example);
		
		return list;
	}

	@Override
	public void addStudent(Student student) {
		student.setStuid(IDUtils.genItemId());
		//user.setCredatedate(new Date());
		//user.setState("0");
		studentMapper.insert(student);
		
	}

	@Override
	public void deleteStudent(Long stuid) {
		studentMapper.deleteByPrimaryKey(stuid);
		
	}

	@Override
	public void updateStudent(Student student) {
		studentMapper.updateByPrimaryKey(student);
	}

	@Override
	public Student getStudentByStudentAndPassword(Student student) {
		StudentExample studentExample =new StudentExample();
		
		com.question.pojo.StudentExample.Criteria criteria=studentExample.createCriteria();
		criteria.andStuloginnameEqualTo(student.getStuloginname());
		criteria.andStupwdEqualTo(student.getStupwd());
		
		Student u=null;
		
		List<Student> studentList=studentMapper.selectByExample(studentExample);
		if(null!=studentList&&studentList.size()>0){
			u=studentList.get(0);
		}
		return u;
	}
	
	
}
