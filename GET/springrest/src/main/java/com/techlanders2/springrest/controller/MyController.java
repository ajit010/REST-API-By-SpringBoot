package com.techlanders2.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techlanders2.springrest.entities.Course;
import com.techlanders2.springrest.services.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private CourseService courseSerivice;

@GetMapping("/home")
public String home() {
		
		return "Welcome to Spring Boot";
	
}
	// Get the Courses
		@GetMapping("/Courses")
		public List<Course> getCourses() {
		
			return this.courseSerivice.getCourse();
		
	
	}
}



