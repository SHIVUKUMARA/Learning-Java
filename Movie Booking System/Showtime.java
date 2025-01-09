package com.moviebookingsystem;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Showtime {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int showtimeid;
	
	@ManyToOne
	@JoinColumn(name="movieid")
	private Movie movie;
	
	@ManyToOne
	@JoinColumn(name="cinemaid")
	private Cinema cinema;
	
	private String showTime;
	private int availableSeats;
	
	@OneToMany(mappedBy="showtime", cascade=CascadeType.ALL)
	private List<Booking> booking;

	public Showtime() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getShowtimeid() {
		return showtimeid;
	}

	public void setShowtimeid(int showtimeid) {
		this.showtimeid = showtimeid;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Cinema getCinema() {
		return cinema;
	}

	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}

	public String getShowTime() {
		return showTime;
	}

	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public List<Booking> getBooking() {
		return booking;
	}

	public void setBooking(List<Booking> booking) {
		this.booking = booking;
	}
}
