package com.moviebookingsystem;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int movieid;
	private String title;
	private String gener;
	private int duration;
	
	@OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
	private List<Showtime> showtime;
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getMovieid() {
		return movieid;
	}

	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGener() {
		return gener;
	}

	public void setGener(String gener) {
		this.gener = gener;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public List<Showtime> getShowtime() {
		return showtime;
	}

	public void setShowtime(List<Showtime> showtime) {
		this.showtime = showtime;
	}
}
