package com.question.service;

import java.util.List;

import com.question.pojo.Student;


public interface StudentService {

	Student getStudentById(Long stuid);

	List<Student> findStudentList();

	void addStudent(Student student);

	void deleteStudent(Long stuid);

	void updateStudent(Student student);

	Student getStudentByStudentAndPassword(Student student);
	
}
