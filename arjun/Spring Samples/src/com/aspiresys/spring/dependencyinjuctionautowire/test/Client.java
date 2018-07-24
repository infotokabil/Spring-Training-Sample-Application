package com.aspiresys.spring.dependencyinjuctionautowire.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {
	public static void main(String args[])
	{
	//	String files[] =new String[] {"com/aspiresys/dependencyinjuctionsecondary/resources/car.xml","com/aspiresys/dependencyinjuctionsecondary/resources/engine.xml"};
	//	ApplicationContext applicationContext= new ClassPathXmlApplicationContext(files);
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/aspiresys/spring/dependencyinjuctionautowire/resources/car-Engine.xml");
		com.aspiresys.spring.dependencyinjuctionautowire.Car c=(com.aspiresys.spring.dependencyinjuctionautowire.Car) applicationContext.getBean("c1");
        c.printDetails();
	}
}
