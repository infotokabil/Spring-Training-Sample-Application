package com.aspiresys.spring.dependencyinjuctionstatic;

public class Car {
	private static String carName;

	public static void setCarName(String carName) {
		Car.carName = carName;
	}
	
	public void print()
	{
		System.out.println(carName);
	}

}
