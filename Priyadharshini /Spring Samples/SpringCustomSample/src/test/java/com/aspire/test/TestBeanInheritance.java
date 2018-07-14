package com.aspire.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aspire.model.Customer;

public class TestBeanInheritance {
	 public static void main( String[] args )
	    {
	    	ApplicationContext context = 
				new ClassPathXmlApplicationContext("appcontext.xml");

	    	Customer cust = (Customer)context.getBean("CustomerBean");
	    	System.out.println(cust);
	    	
	    }
}
