package com.aspire.annotation;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	private int id;

	private String city;
	
	private String country;

	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", country=" + country + "]";
	}
	
	

}
