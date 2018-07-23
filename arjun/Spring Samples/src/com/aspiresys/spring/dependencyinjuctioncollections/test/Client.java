package com.aspiresys.spring.dependencyinjuctioncollections.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aspiresys.spring.dependencyinjuctioncollections.Test11;



public class Client {
public static void main(String args[])
{
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/aspiresys/spring/dependencyinjuctioncollections/resources/spring.xml");
	Test11 test=(Test11) applicationContext.getBean("T");
	test.printData();
}
}
