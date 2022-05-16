package com.vit.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.vit.model.Course;
import com.vit.model.Student;

@Component
public class StudentService {
	
	        private static List<Student> students = new ArrayList<>();  
	        
	        static {
	    		//Initialize Data
	    		Course course1 = new Course("Course1", "Spring", "10Steps", Arrays
	    				.asList("Learn Maven", "Import Project", "First Example",
	    						"Second Example"));
	    		Course course2 = new Course("Course2", "Spring MVC", "10 Examples",
	    				Arrays.asList("Learn Maven", "Import Project", "First Example",
	    						"Second Example"));
	    		Course course3 = new Course("Course3", "Spring Boot", "6K Students",
	    				Arrays.asList("Learn Maven", "Learn Spring",
	    						"Learn Spring MVC", "First Example", "Second Example"));
	    		Course course4 = new Course("Course4", "Maven",
	    				"Maven Course!", Arrays.asList(
	    						"Pom.xml", "Build Life Cycle", "Parent POM",
	    						"Importing into Eclipse"));

	    		Student vit = new Student("Student1", "Vit Rod",
	    				"Reader, Programmer, Willy Wonka of code", new ArrayList<>(Arrays
	    						.asList(course1, course2, course3, course4)));

	    		Student jane = new Student("Student2", "Jane Doe",
	    				"Dancer, Programmer and Code Lover", new ArrayList<>(Arrays
	    						.asList(course1, course2, course3, course4)));

	    		students.add(vit);
	    		students.add(jane);
	    	}
	        
	        public List<Student> retrieveAllStudents() {
	    		return students;
	    	}
	        
	        
	        public Student retrieveStudent(String studentId) {
	    		for (Student student : students) {
	    			if (student.getId().equals(studentId)) {
	    				return student;
	    			}
	    		}
	    		return null;
	    	}
	        
	        public List<Course> retrieveCourses(String studentId) {
	    		Student student = retrieveStudent(studentId);
	    		
	    		if(studentId.equalsIgnoreCase("Student1")){
	    			throw new RuntimeException("Something went wrong");
	    		}

	    		if (student == null) {
	    			return null;
	    		}

	    		return student.getCourses();
	    	}

	        

}
