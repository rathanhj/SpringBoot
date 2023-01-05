package com.durga.springbootnew.course.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.durga.springbootnew.course.bean.course;

@RestController
public class CourseController {

	//http:localhost:8080/courses - used as address in webpage
	@GetMapping("/courses")
	public List<course>getAllcourses(){
		return Arrays.asList(new course(1, "microservices", "durga"),
		new course(2, "Full Stack with Angular", "durga"));
	}
		//http:localhost:8080/courses/1 - used as address in webpage
	@GetMapping("/courses/1")
	public course getCourse(){
			return new course(1, "learnmicroservices", "durga");		
	}
}
