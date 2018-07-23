package com.aspiresys.spring.dependencyinjuctioncollections;

import java.util.List;
import java.util.Set;

public class Test11 {
	private List fruits;
	 private Set Cricketers;
	
 public void setFruits(List fruits) {
		this.fruits = fruits;
	}
	public void setCricketers(Set cricketers) {
		Cricketers = cricketers;
	}
public void printData()
{
	System.out.println("Fruits are");
	for(Object fruit : fruits)
	{
		System.out.println(fruit);
	}
	System.out.println("Cricketers....");
	for(Object cricketer: Cricketers)
	{
		System.out.println(cricketer);
	}
}
}
