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
	    		Course course1 = new Course("Course1", "Math", "Learning", Arrays
	    				.asList("Learn from book", "Making Project", "First Example",
	    						"Second Example"));
	    		Course course2 = new Course("Course2", "Biology", "Learning plants",
	    				Arrays.asList("Learn from book", "Making Project", "First Example",
	    						"Second Example"));
	    		Course course3 = new Course("Course3", "Drawing", "Learning",
	    				Arrays.asList("Learn from book", "Making drawing",
	    						"Drawing animals", "First Example", "Second Example"));
	    		Course course4 = new Course("Course4", "Programming",
	    				"Java Course!", Arrays.asList(
	    						"Maven", "Spring", "Spring Boot",
	    						"Making project in Eclipse"));

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
	    		
//	    		if(studentId.equalsIgnoreCase("Student1")){
//	    			throw new RuntimeException("Something went wrong");
//	    		}

	    		if (student == null) {
	    			return null;
	    		}
    
	    		return student.getCourses();
	    	}
	        
	        public Course retrieveCourse(String studentId, String courseId) {
	    		Student student = retrieveStudent(studentId);

	    		if (student == null) {
	    			return null;
	    		}

	    		for (Course course : student.getCourses()) {
	    			if (course.getId().equals(courseId)) {
	    				return course;
	    			}
	    		}

	    		return null;
	    	}
                                
	                                                                                      
                
}
