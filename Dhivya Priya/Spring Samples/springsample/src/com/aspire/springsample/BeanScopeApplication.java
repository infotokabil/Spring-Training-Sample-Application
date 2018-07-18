package com.aspire.springsample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApplication {

	public static void main(String[] args) {
		 // load the spring configuration file
	    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanscope-applicationContext.xml");		
			
			
	    // load or retrieve bean from spring container	
	    FirstInterface firstInterface1 = applicationContext.getBean("user",FirstInterface.class);
	    FirstInterface firstInterface2 = applicationContext.getBean("user",FirstInterface.class);		
	    
	    //call methods on the bean		
		System.out.println(firstInterface1.getDetails());
		
		System.out.println(firstInterface2.getDetails());
		
		if(firstInterface1==firstInterface2)
		 System.out.println("Pointing to same object");
		else 
	     System.out.println("Not pointing to same object");
		
		System.out.println("memory location of first reference is "+ firstInterface1);
		System.out.println("memory location of second referece is "+ firstInterface2);
	}

}
