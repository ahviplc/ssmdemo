package com.question.service;


import java.util.List;

import com.question.pojo.Teacher;


public interface TeacherService {

	Teacher getTeacherById(Long tchid);

	List<Teacher> findTeacherList();

	void addTeacher(Teacher teacher);

	void deleteTeacher(Long tchid);

	void updateTeacher(Teacher teacher);

	Teacher getTeacherByTeacherAndPassword(Teacher teacher);

	

	
}
