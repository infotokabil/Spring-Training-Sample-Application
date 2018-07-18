package com.aspire.springsample;

import org.springframework.stereotype.Component;

@Component
public class ThirdClass {
	
	public String getInfo(){
		return "New class";
	}

	public String getMessage(){
		return "Accessing method from second class";
	}
}
