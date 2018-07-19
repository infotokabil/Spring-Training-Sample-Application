package com.aspire.sampleDependsOn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
		context.refresh();
		Employee st= (Employee)context.getBean("employee");
	        System.out.println(st.getOffice().getName());		
			}	 

	}

