package com.aspire.builder;

public class Shop {

	public static void main(String[] args) {
		
		Phone obj = new PhoneBuilder().setOs("android").setRam(3).getPhone();
		System.out.println(obj); 
		
	}

}
