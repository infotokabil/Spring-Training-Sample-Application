package com.aspire.facade;

public class InventoryService {
	public static boolean isAvailable(Product product) {
		System.out.println("product is available in database");
		return true;
	}
}
