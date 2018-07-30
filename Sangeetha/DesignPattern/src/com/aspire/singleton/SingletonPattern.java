package com.aspire.singleton;

public class SingletonPattern {
	
	public static void main(String[] args) {
		
		SingletonExample connection1 = SingletonExample.getSingletonInstance();
		SingletonExample connection2 = SingletonExample.getSingletonInstance();
		if (connection1 == connection2) {
			System.out.println("Same object");
		} else {
			System.out.println("Objects are not equal");
		}
	}

}
