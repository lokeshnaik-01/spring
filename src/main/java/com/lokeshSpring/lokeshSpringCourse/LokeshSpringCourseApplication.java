package com.lokeshSpring.lokeshSpringCourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (
		// explicitly listing base packages to scan
		scanBasePackages ={
				"com.lokeshSpring.util",
				"com.lokeshSpring.lokeshSpringCourse"
		}
)
public class LokeshSpringCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(LokeshSpringCourseApplication.class, args);
	}

}
