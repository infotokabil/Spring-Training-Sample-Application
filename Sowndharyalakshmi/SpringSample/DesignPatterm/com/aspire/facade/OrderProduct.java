package com.aspire.facade;

public class OrderProduct {
	public static void main(String[] args) {
		OrderServiceFacadeImpl placeorder = new OrderServiceFacadeImpl();
		placeorder.placeOrder(6);
		
	}
}
