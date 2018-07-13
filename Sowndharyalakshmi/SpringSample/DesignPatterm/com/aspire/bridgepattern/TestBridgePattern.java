package com.aspire.bridgepattern;

import org.junit.Test;

public class TestBridgePattern {
	@Test
	public void testBooking() {
		TicketBooking tickets = new BusTicketBooking();
		TicketBookingManager booktickets = new BusBooking(tickets);
		booktickets.bookTicket();
		
		TicketBooking traintickets = new TrainTicketBooking();
		TicketBookingManager booktraintickets = new TrainBooking(traintickets);
		booktraintickets.bookTicket();
	}

}
