package com.aspire.springsample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleApplication {

	public static void main(String[] args) {
		 // load the spring configuration file
	    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");		
			
			
	    // load or retrieve bean from spring container	
	    FirstInterface firstInterface1 = applicationContext.getBean("user",FirstInterface.class);
	   		
	    
	    //call methods on the bean		
		System.out.println(firstInterface1.getDetails());
		
		
	}

}
