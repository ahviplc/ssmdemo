package com.question.service;

import java.util.List;

import com.question.pojo.Course;


public interface CourseService {

	void addCourse(Course course);

	List<Course> findCourseList();

	Course getCourseById(Long crseid);

	void delete(Long crseid);

	void updateCourse(Course course);

	List<Course> findCourseByTopic(String crstopic);

	

}
