package com.aspiresys.spring.dependencyinjuctionstatic.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aspiresys.spring.dependencyinjuctionstatic.Car;

public class Client {
public static void main(String args[])
{
	ApplicationContext ap=new ClassPathXmlApplicationContext("com/aspiresys/spring/dependencyinjuctionstatic/resources/static.xml");
    Car c=(Car) ap.getBean("c");
    c.print();
}
}
