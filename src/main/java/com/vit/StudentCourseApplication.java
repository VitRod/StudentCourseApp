package com.vit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StudentCourseApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(
				StudentCourseApplication.class, args);
		System.out.println(ctx);
	}

}
          