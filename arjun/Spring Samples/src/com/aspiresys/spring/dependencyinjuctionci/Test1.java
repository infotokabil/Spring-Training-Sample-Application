package com.aspiresys.spring.dependencyinjuctionci;

public class Test1 {
	
	private String gender;
	private int age;
    Test1(String gender)
    {
    	this.gender=gender;
    }
    Test1(String gender ,int age )
    {
    	this.gender=gender;
    	this.age=age;
    }
    Test1(int age)
    {
    	this.age=age;
    }

public void hello (String name)
{
	System.out.println("Welcome " +gender +" "+ name);
	System.out.println("Age =" +age);
}
  
}