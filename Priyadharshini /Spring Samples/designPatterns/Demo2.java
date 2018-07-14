package com.aspire.designPatterns;

public class Demo2 {
	public static void main(String[] args) {
		System.out.println(SingletonExample.getInstance());
		SingletonExample singletonObject = SingletonExample.getInstance();
        System.out.println(singletonObject);
		singletonObject.sayHello();
	}
}
