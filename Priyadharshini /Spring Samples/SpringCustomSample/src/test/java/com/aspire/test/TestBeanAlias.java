package com.aspire.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aspire.model.TrianglePoint;

public class TestBeanAlias {
	public static void main(String[]args){
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");
		TrianglePoint obj = (TrianglePoint)context.getBean("triangle-alias");
		obj.draw();
	}

}
