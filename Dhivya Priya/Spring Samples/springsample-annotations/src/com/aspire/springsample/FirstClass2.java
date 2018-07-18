package com.aspire.springsample;

import org.springframework.beans.factory.annotation.Value;

public class FirstClass2 implements FirstInterface {

	private SecondInterface secondInterface;
	
	//property file injection
		@Value("${office}")
		private String office;
		
		public String getOffice() {
			return office;
		}
	
	public FirstClass2(SecondInterface secondInterface){
     this.secondInterface = secondInterface;
	}
	
	@Override
	public String getDetails() {
		
		return "Successfully done";
	}

	@Override
	public String getSecondInterface() {
		
		return secondInterface.getFromSecondInterface();
	}

}
