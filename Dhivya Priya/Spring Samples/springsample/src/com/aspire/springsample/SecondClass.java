package com.aspire.springsample;

public class SecondClass implements FirstInterface {

	//define a private field for dependency
    private SecondInterface secondInterface;
	
    
	public void setSecondInterface(SecondInterface theSecondInterface){
		 secondInterface=theSecondInterface;
	}
   
	public String getSentence(){
		return secondInterface.getInformation();
	}
	
	@Override
	public String getDetails() {
		
		return "This is the second class ";
	}

}
