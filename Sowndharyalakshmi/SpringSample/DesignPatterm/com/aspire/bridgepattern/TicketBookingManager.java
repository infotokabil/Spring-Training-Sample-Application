package com.aspire.bridgepattern;

public abstract class TicketBookingManager {
	TicketBooking ticketbooking;

	public TicketBookingManager(TicketBooking ticketbooking) {
		this.ticketbooking = ticketbooking;
	}

	abstract void bookTicket();
}
