package com.aspiresys.springannotation;

public class AirtelNetwork implements ServiceProvider {
	@Override
	public void assignService() {
		System.out.println("Service is provided to airtel");
	}

}
