package com.aspire.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;

public class AppConfiguration {
	@Bean(name="college")
	public College getCollege(){
		College c= new College();
		c.setLocation("chennai");
		c.setName("AU");
		return c;
	}
	@Bean(name="student")
	@DependsOn("college")
	public Student getStudent(){
		Student s= new Student();
		s.setName("PriyaS");
		s.setCollege(getCollege());
		return s;
	}
}
