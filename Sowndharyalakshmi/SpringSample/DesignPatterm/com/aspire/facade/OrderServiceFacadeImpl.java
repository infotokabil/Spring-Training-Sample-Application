package com.aspire.facade;

public class OrderServiceFacadeImpl implements OrderServiceFacade {
	 public boolean placeOrder(int pId){
	        boolean orderFulfilled=false;
	        Product product=new Product();
	        product.id=pId;
	        if(InventoryService.isAvailable(product))
	        {
	            System.out.println("Product with ID: "+ product.id+" is available.");
	            boolean paymentConfirmed= PaymentService.makePayment();
	            if(paymentConfirmed){
	                System.out.println("Payment confirmed...");
	                ShippingService.shipProduct(product);
	                System.out.println("Product shipped...");
	                orderFulfilled=true;
	            }
	        }
	        return orderFulfilled;
	    }

}
