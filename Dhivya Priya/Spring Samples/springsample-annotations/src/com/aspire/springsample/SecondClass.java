package com.aspire.springsample;

import org.springframework.stereotype.Component;

@Component
public class SecondClass implements SecondInterface {

	@Override
	public String getFromSecondInterface() {
		return "This is the message from second interface";
		
	}
	


}
