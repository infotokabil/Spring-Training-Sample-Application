package com.aspire.bridgepattern;

public class BusBooking extends TicketBookingManager{

	public BusBooking(TicketBooking ticketbooking) {
		super(ticketbooking);
	}

	@Override
	void bookTicket() {
		ticketbooking.checkAvailability();
		ticketbooking.blockSeats();
		ticketbooking.payAmount();
	}

}
