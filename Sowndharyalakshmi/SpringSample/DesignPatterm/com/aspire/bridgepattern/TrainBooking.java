package com.aspire.bridgepattern;

public class TrainBooking extends TicketBookingManager {

	public TrainBooking(TicketBooking ticketbooking) {
		super(ticketbooking);
	}

	@Override
	void bookTicket() {
		ticketbooking.checkAvailability();
		ticketbooking.blockSeats();
		ticketbooking.payAmount();
	}

}
