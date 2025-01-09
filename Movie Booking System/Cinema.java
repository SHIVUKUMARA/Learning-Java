package com.moviebookingsystem;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cinema {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cinemaid;
	private String theaterName;
	private String location;
	
	@OneToMany(mappedBy = "cinema", cascade = CascadeType.ALL)
	private List<Showtime> showtime;
	
	public Cinema() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCinemaid() {
		return cinemaid;
	}

	public void setCinemaid(int cinemaid) {
		this.cinemaid = cinemaid;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Showtime> getShowtime() {
		return showtime;
	}

	public void setShowtime(List<Showtime> showtime) {
		this.showtime = showtime;
	}
	
}
