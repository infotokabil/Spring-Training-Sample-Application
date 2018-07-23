package com.aspiresys.firstspring.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main (String args[])
	{
		Resource resource =new ClassPathResource("com/aspiresys/firstspring/resources/spring.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		factory.getBean("t");
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/aspiresys/firstspring/resources/spring.xml");
		applicationContext.getBean("t");
		applicationContext.getBean("t");
	}
}
