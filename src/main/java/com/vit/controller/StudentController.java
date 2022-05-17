package com.vit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.vit.model.Course;
import com.vit.model.Student;
import com.vit.service.StudentService;


@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/students/{studentId}/courses")
	public List<Course> retieveCoursesForStudents(@PathVariable String studentId){
		return studentService.retrieveCourses(studentId);
	}
	
	@GetMapping("/students")
	public List<Student> retieveStudents(){
		return studentService.retrieveAllStudents();
	}
	
	             
}
