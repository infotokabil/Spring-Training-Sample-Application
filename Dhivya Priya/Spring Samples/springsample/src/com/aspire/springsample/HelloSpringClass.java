package com.aspire.springsample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringClass {

	public static void main(String[] args) {
		
    // load the spring configuration file
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");		
		
		
    // load bean from spring container	
    FirstInterface firstInterface1 = applicationContext.getBean("user",FirstInterface.class);
    FirstClass firstClass = applicationContext.getBean("user",FirstClass.class); 		
		
    //call methods on the bean		
	System.out.println(firstInterface1.getDetails());
	
	System.out.println(firstInterface1.getSentence());
	
	System.out.println(firstInterface1.getDetails());
	
	//call method to get literal values(Hard coded value)
	System.out.println("----------------Hardcoded value----------------");
	System.out.println("User name :"+firstClass.getUserName());
	
	//call method  and inject from property file
	System.out.println("--------------Injection from property file----");
	System.out.println("Office :"+firstClass.getOffice());
    //close the context		
	//applicationContext.close();
	}

}
