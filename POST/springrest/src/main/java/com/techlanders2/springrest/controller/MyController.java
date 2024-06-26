package com.techlanders2.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
		
	// Get the Course by course-id
		@GetMapping("/Courses/{courseId}")
		public Course getCourse(@PathVariable String courseId) {
				
			return this.courseSerivice.getCourse(Long.parseLong(courseId));
				
			
			}
		
	// Create new Course by "POST" Method
		@PostMapping("/Courses")
		public Course addCourse(@RequestBody Course course) {
						
			return this.courseSerivice.addCourse(course);
			
		}
				
}



