package com.aspiresys.springannotation;

public class JioNetwork implements ServiceProvider {
	@Override
	public void assignService() {
		System.out.println("Service provided to Jio Network");
	}
}
