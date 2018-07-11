package com.aspire.singleton;

public class StaticSingleton {
	private static StaticSingleton instance;
	  
	private StaticSingleton() {
		System.out.println("object initialised");
	
	}
	
	static {
		try {
			instance = new StaticSingleton();
		}catch(Exception exception) {
			System.out.println(exception.getMessage());
		}
	}
	public static StaticSingleton getInstance() {
		return instance;
	}
}
