package com.aspire.springsample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigApp {

	public static void main(String[] args) {
		
    // load the spring configuration file
   // ApplicationContext applicationContext = new AnnotationConfigApplicationContext("applicationContext.xml");	
		
		//read spring config java class
		 ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SampleConfig.class);	
		
		
    // load bean from spring container	
    FirstInterface firstInterface1 = applicationContext.getBean("data",FirstInterface.class);
  //  FirstClass firstClass = applicationContext.getBean("user",FirstClass.class); 		
		
    //call methods on the bean		
	System.out.println(firstInterface1.getDetails());
	
	System.out.println(firstInterface1.getDetails());
	
	
    //close the context		
	//applicationContext.close();
	}

}
