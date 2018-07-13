package com.aspire.bridgepattern;

public class BusTicketBooking implements TicketBooking {

	@Override
	public void checkAvailability() {
//		BusDetails busnumber;
		System.out.println("checking availability of seats in bus");

	}

	@Override
	public void blockSeats() {
		System.out.println("your seats have been blocked in the specified bus");
	}

	@Override
	public void payAmount() {
		System.out.println("Amount payment for the bus booking");
	}

}
