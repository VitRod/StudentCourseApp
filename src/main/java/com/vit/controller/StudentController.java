package com.vit.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.vit.model.Course;
import com.vit.service.StudentService;

public class StudentController {

	private StudentService studentService;
	
	@GetMapping("/students/{studentId}/courses")
	public List<Course> retieveCoursesForStudents(@PathVariable String studentId){
		return studentService.retrieveCourses(studentId);
	}
	
	
}
