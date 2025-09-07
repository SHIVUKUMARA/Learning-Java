package com.flightbooking;

public class Flight {

	private String flightid;
	private String source;
	private String destination;
	private int seats;
	
	
	public String getFlightid() {
		return flightid;
	}
	public void setFlightid(String flightid) {
		this.flightid = flightid;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	@Override
	public String toString() {
		return "Flight [flightid=" + flightid + ", source=" + source + ", destination=" + destination + ", seats="
				+ seats + "]";
	}
}
