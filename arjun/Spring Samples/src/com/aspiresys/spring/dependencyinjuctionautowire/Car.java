package com.aspiresys.spring.dependencyinjuctionautowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	
	
	private String carName;
//	@Qualifier(value="e2")
	@Qualifier("e2")
	@Autowired
	private Engine engine;
	

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public void printDetails()
	{
		System.out.println("Car name "+ carName);
		System.out.println("Engine name "+engine.getModelYear());
	}
}
