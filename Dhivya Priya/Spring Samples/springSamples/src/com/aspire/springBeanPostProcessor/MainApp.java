package com.aspire.springBeanPostProcessor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		      AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		      //bean aliasing is done
		      
		      //object can be passed to the bean post processor also
		      //before that class A is called (depends on) 
		      
		     /* In spring application XML, if we need to initialize any bean 
		      before any other bean, depends-on do this job.
		      While creating bean we need to define depends-on attribute in bean. */
		      
		      HelloWorld obj = (HelloWorld) context.getBean("world");
		      obj.getMessage();
		      
		      
		       
		   }
     }

	


