package com.aspire.bridgepattern;

public class TrainTicketBooking implements TicketBooking {

	@Override
	public void checkAvailability() {
//		TrainDetails traindetails;
		System.out.println("Checking seats in the train");
	}

	@Override
	public void blockSeats() {
		System.out.println("Blocking seats in the train");
	}

	@Override
	public void payAmount() {
		System.out.println("Payment processing for train booking");
	}

}
