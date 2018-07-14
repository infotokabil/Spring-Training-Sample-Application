package com.aspire.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aspire.model.Student;

public class TestInnerBean {
	public static void main(String[] args) {
		ApplicationContext  context = new ClassPathXmlApplicationContext("appconfig1.xml");
                Student st=(Student) context.getBean("student");
                System.out.println("Student Name:"+ st.getName());
                System.out.println("City Name:"+st.getCity().getCityName());
                System.out.println("City Population:"+st.getCity().getPopulation());        
	}
}
