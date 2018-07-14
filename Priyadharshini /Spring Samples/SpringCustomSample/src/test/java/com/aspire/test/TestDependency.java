package com.aspire.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aspire.model.Customer;

public class TestDependency {
	public static void main(String[] args) {
		 
		// loading the definitions from the given XML file
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"appConfig.xml");
 
	Customer obj = (Customer) context.getBean("CustomerBean");
	 /*   System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println(obj.getAddress());*/
	System.out.println(obj.getAction() + obj.getType() );
		
}
}
