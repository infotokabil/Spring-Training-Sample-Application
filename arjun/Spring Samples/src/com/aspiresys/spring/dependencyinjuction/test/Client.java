package com.aspiresys.spring.dependencyinjuction.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aspiresys.spring.dependencyinjuction.Test;

class Client
{
public static void main (String args[])
{
	
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/aspiresys/spring/dependencyinjuction/resources/spring.xml");
	
    Test test=(Test) applicationContext.getBean("t");
    test.hello("Arjun");
}
}