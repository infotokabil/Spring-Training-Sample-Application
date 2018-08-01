package com.aspire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Customer {
	
    private String name;
	
    @Autowired
    Address address;

	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + "]";
	}
    
    

}
