package com.aspiresys.spring.dependencyinjuction;

public class Test {
	
	private String gender;
  public void setGender(String gender) {
		this.gender = gender;
	}

public void hello (String name)
{
	System.out.println("Welcome " +gender +" "+ name);
}
  
}
