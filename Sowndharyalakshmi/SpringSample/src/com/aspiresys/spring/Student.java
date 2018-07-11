package com.aspiresys.spring;

public class Student {
	private String name;
	FamilyDetails detail;

	/*public Student() {
		System.out.println("object created");
	}*/

	// constructor injection
	public Student(FamilyDetails detail) {
		System.out.println("sd");
		this.detail = detail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Student [name=" + name + "]"+" "+detail;
	}

	public FamilyDetails getDetail() {
		return detail;
	}

	public void setDetail(FamilyDetails detail) {
		this.detail = detail;
	}

}