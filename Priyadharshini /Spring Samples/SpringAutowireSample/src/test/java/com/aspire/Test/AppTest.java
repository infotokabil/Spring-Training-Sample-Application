package com.aspire.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aspire.model.AppConfiguration;
import com.aspire.model.Student;

public class AppTest {
	public static void main(String[] args)  {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
 		ctx.register(AppConfiguration.class);
 		ctx.refresh();
		Student st= (Student)ctx.getBean("student");
	        System.out.println(st.getCollege().getName());		
	}
}
