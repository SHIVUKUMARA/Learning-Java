package com.moviebookingsystem;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingid;
	
	@ManyToOne
	@JoinColumn(name="userid")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="showtimeid")
	private Showtime showtime;
	
	private int numberOfSeats;
	private double totalprice;
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBookingid() {
		return bookingid;
	}

	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Showtime getShowtime() {
		return showtime;
	}

	public void setShowtime(Showtime showtime) {
		this.showtime = showtime;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public double getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}
	
}
