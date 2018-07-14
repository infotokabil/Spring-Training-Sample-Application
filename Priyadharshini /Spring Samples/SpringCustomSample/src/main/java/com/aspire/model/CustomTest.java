package com.aspire.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomTest {
	public static void main(String[] args) {
		 
		// loading the definitions from the given XML file
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
 
		DemoBean service = (DemoBean) context.getBean("demoBean");
		service.customInit();
		service.customDestroy();
}
}
