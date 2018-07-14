package com.aspire.model;

public class Student {
	private City city;
	private String name;
	public Student () {}
	public Student(City city, String name){
		this.city=city;
		this.name=name;
	}
	public City getCity() {
		return city;
	}
	public String getName() {
		return name;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public void setName(String name) {
		this.name = name;
	}
}
