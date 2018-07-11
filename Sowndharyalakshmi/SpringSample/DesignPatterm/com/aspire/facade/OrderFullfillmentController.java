package com.aspire.facade;

public class OrderFullfillmentController {
	  OrderServiceFacade facade;
	    boolean orderFulfilled=false;
	    public void orderProduct(int productId) {
	        orderFulfilled=facade.placeOrder(productId);
	        System.out.println("OrderFulfillmentController: Order fulfillment completed. ");
	    }
}
