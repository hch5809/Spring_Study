package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	@Bean
	public Student student1() {
		
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("수영");
		hobbys.add("농구");
		
		Student student = new Student("홍창호");
		student.setAge(10);
		student.setHobbys(hobbys);
		
		return student;
	}
	
	@Bean
	public Student student2() {
		
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("독서");
		hobbys.add("수다");
		
		Student student = new Student("김종준");
		student.setAge(5);
		student.setHobbys(hobbys);
		
		return student;
	}
	
}
