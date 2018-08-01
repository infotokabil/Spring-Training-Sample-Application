package com.aspire.constructor;

public class Customer {
	
	private String name;
	
    Address address;
	
	Customer(String name, Address address)
	{
		System.out.println("Customer construtor");
		this.name=name;
		this.address=address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + "]";
	}
	
	

}
