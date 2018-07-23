package com.aspiresys.dependencyinjuctionsecondary.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aspiresys.dependencyinjuctionsecondary.Car;


public class Client {
	public static void main(String args[])
	{
	//	String files[] =new String[] {"com/aspiresys/dependencyinjuctionsecondary/resources/car.xml","com/aspiresys/dependencyinjuctionsecondary/resources/engine.xml"};
	//	ApplicationContext applicationContext= new ClassPathXmlApplicationContext(files);
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/aspiresys/dependencyinjuctionsecondary/resources/car-engine.xml");
		Car c=(Car) applicationContext.getBean("c");
        c.printDetails();
	}

}
