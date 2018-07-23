package com.aspiresys.spring.dependencyinjuction;

public class Test {
	
	private String gender;
	private int age;
 public void setAge(int age)
 {
	 this.age=age;
 }
  public void setGender(String gender) {
		this.gender = gender;
	}
  

public void hello (String name)
{
	System.out.println("Welcome " +gender +" "+ name);
	System.out.println("age "+age );
}
  
}
