package com.aspire.facade;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestClass {
	@Test
	public void testOrderProduct() throws Exception {
		OrderFullfillmentController controller = new OrderFullfillmentController();
		controller.facade = new OrderServiceFacadeImpl();
		controller.orderProduct(9);
		boolean result = controller.orderFulfilled;
		assertTrue(result);
	}
}
