package com.aspire.springsample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NewJavaConfigApp {
	
		public static void main(String[] args) {
		
			
     //read spring config java class
     ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SampleConfig.class);	
			
			
	    // load bean from spring container	
        FirstClass2 firstClass2 = applicationContext.getBean("firstClass2",FirstClass2.class);
	  //  FirstClass firstClass = applicationContext.getBean("user",FirstClass.class); 		
			
	    //call methods on the bean		
		System.out.println(firstClass2.getDetails());
		
		System.out.println(firstClass2.getSecondInterface());
		
		//call new firstclass2 method (it has values injected from property file)
		System.out.println("---------------Property file injection---------------");
		System.out.println("office : "+firstClass2.getOffice());
		
		
	    //close the context		
		//applicationContext.close();
		}

	}


