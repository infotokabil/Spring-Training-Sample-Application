package com.aspire.singleton;

public class PrivateClassSingleton {

	private PrivateClassSingleton() {
		System.out.println("object initialised");
	}

	private static class InstanceRestriction {
		private static final PrivateClassSingleton instance = new PrivateClassSingleton();
	}

	public static PrivateClassSingleton getInstance() {
		return InstanceRestriction.instance;
	}
}
