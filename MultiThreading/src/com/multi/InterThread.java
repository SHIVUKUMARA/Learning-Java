package com.multi;

class TicketBooking{
	static int totalAmount = 900;
	public synchronized void withdrawAmount(int requestedAmount) throws InterruptedException{
		if(requestedAmount > totalAmount) {
			System.out.println("Amount is less");
			wait();
		}
		System.out.println("Ticket Booked");
	}
	
	public synchronized void depositAmount() {
		System.out.println("Depositing Amount........");
		totalAmount += 1000;
		System.out.println("Amount Deposited");
		notify();
	}
}

class AThread extends Thread {
	private TicketBooking ticketbooking;

	AThread(TicketBooking ticketBooking) {
		this.ticketbooking = ticketBooking;
	}

	public void run() {
		try {
			this.ticketbooking.withdrawAmount(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class BThread extends Thread {
	private TicketBooking ticketBooking;

	BThread(TicketBooking ticketBooking) {
		this.ticketBooking = ticketBooking;
	}

	public void run() {
		this.ticketBooking.depositAmount();
	}
}

public class InterThread {

	public static void main(String[] args) throws InterruptedException {
       TicketBooking ticketbooking = new TicketBooking();
       AThread t = new AThread(ticketbooking);
       BThread th = new BThread(ticketbooking);
       
       
	}

}
