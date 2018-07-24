package com.aspiresys.spring.dependencyinjuctionpnamespace.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;








public class Client {
	public static void main(String args[])
	{
	//	String files[] =new String[] {"com/aspiresys/dependencyinjuctionsecondary/resources/car.xml","com/aspiresys/dependencyinjuctionsecondary/resources/engine.xml"};
	//	ApplicationContext applicationContext= new ClassPathXmlApplicationContext(files);
        ApplicationContext ap=new ClassPathXmlApplicationContext("com/aspiresys/spring/dependencyinjuctionpnamespace/resources/carengine.xml");
	com.aspiresys.spring.dependencyinjuctionpnamespace.Car c=(com.aspiresys.spring.dependencyinjuctionpnamespace.Car) ap.getBean("car");
        c.printDetails();
	}

}
