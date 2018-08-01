package com.aspire.collectionsObjects;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SIMapExample {
	
		public static void main(String[] args) {
			
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("configPrimitive.xml");	
			
			Book book = (Book)applicationContext.getBean("ob");
			
			List<Topic> states = book.getBookList();
	 
			System.out.println("Topic : " + book.getTopicName());
			Iterator<Topic> itr = states.iterator();
			while (itr.hasNext()) {
				Topic s = (Topic) itr.next();
				System.out.println(s.getName() + " : " + s.getId());
			}
		}
	}

