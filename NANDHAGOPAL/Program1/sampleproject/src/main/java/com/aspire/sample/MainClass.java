package com.aspire.sample;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("sample.xml");
		Student s=(Student) context.getBean("student");
		s.print();

	}

}
