package com.aspire.springsample;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FourthClass implements SecondInterface{

	//create an array of strings
	private String[] data = {
		    "Hello !!",
			"Good morning :)",
			"Have a nice day !!!"
	};
	
	//create a random number generator
	private Random random=new Random();
	
	@Override
	public String getFromSecondInterface() {
		//pick a random string from the array
		/*int index=random.nextInt(data.length);
		String randomArray=data[index];
		return randomArray;*/
		return "This is the message from second interface (new implementation) ";
		
	}
}
