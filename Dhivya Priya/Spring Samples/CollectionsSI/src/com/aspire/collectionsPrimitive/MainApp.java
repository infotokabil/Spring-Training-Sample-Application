package com.aspire.collectionsPrimitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainApp {
	
		public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("configPrimitive2.xml");	
			
			Library library= (Library)applicationContext.getBean("ob");
	 
			System.out.println("Library Name : " + library.getLibraryName());
			System.out.println("list : " + library.getBookTopics());
			System.out.println("set : " + library.getAuthors());
			System.out.println("map : " + library.getBooks());
		}
	}

