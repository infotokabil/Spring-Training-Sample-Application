package com.aspiresys.spring.dependencyinjuctionpnamespace;

public class Car {
	private String carName;
	private Engine engine;
	

	public void setCarName(String carName) {
		this.carName = carName;
	}
	public void setEngine(Engine engine)
	{
		this.engine=engine;
	}

	public void printDetails()
	{
		System.out.println("Car name "+ carName);
		System.out.println("Engine name "+engine.getModelYear());
	}
}