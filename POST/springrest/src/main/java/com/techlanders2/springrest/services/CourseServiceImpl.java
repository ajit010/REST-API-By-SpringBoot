package com.techlanders2.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.techlanders2.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List <Course> list;
	
	public CourseServiceImpl()	{
		
		list=new ArrayList<>();
		list.add(new Course (145, "Java Course", "this ccourse is for basic java"));
		list.add(new Course (156, "Java Advanced", "this course is for advanced java"));
		
	}
		
	@Override
	public List<Course> getCourse() {
		
		
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		
		Course c = null;
		for(Course Course:list) {
		
			if(Course.getId()==courseId) {
				
			    c = Course;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		
		list.add(course);
	
		return course;
	}

}
