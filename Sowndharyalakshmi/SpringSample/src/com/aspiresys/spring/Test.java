package com.aspiresys.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Test {
	public static void main(String[] args) {
		ClassPathResource resource = new ClassPathResource("application.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Student studentbean = (Student) factory.getBean("studentbean");
		System.out.println(studentbean);

		ApplicationContext context1 = new ClassPathXmlApplicationContext("application.xml");
		Student student = (Student) context1.getBean("studentbean");

		System.out.println("Student Details" + student);
		System.out.println(student);
	}
}
