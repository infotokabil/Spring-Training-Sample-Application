package com.aspire.springsample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationSampleApplication {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");		
			
			
		    // load or retrieve bean from spring container	
		    
		    // FirstInterface firstInterface1 = applicationContext.getBean("data",FirstInterface.class);
		    
		    FirstInterface firstInterface1 = applicationContext.getBean("data",FirstInterface.class);
		    
		    FirstClass firstClass = (FirstClass)applicationContext.getBean("data");
		    
		    //call methods on the bean
		    System.out.println("-----------constructor injection-----(  interface  )-----------");
			System.out.println(firstInterface1.getDetails());
			System.out.println(firstInterface1.getSecondInterface());
			
			System.out.println("          ");
		    System.out.println("-----------setter injection--------( from class )--------");
			System.out.println(firstClass.method1ThirdClass());
			System.out.println(firstClass.method2ThirdClass());
			
			
		    System.out.println("-----------property file injection--------( from class )--------");
		    System.out.println(firstClass.getOffice());
		    
		    //System.out.println("          ");
		    //((ClassPathXmlApplicationContext)applicationContext).close();
	}
}
