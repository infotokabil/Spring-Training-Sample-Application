package com.aspiresys.spring.dependencyinjuctionci.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main (String args[])
	{
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/aspiresys/spring/dependencyinjuctionci/resources/spring1.xml");
		
	    com.aspiresys.spring.dependencyinjuctionci.Test1 test=(com.aspiresys.spring.dependencyinjuctionci.Test1)applicationContext.getBean("t1");
	    test.hello("Arjun");
	}
	}