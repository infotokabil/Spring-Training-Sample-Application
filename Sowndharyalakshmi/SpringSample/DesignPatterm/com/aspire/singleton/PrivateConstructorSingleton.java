package com.aspire.singleton;

public class PrivateConstructorSingleton {
	private static final PrivateConstructorSingleton instance = new PrivateConstructorSingleton();

	private PrivateConstructorSingleton() {
		System.out.println("object Intialized");
	}

	public static PrivateConstructorSingleton getInstance() {
		return instance;
	}
}
