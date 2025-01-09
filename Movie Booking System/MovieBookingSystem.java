package com.moviebookingsystem;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MovieBookingSystem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		// creating movie
		Movie m = new Movie();
		System.out.print("Enter Movie Title: ");
		String title = sc.nextLine();
		m.setTitle(title);
		System.out.print("Enter Movie Gener: ");
		String gener = sc.nextLine();
		m.setGener(gener);
		System.out.print("Enter Movie duration in Minutes: ");
		int duration = sc.nextInt();
		sc.nextLine();
		m.setDuration(duration);
		
		// creating cinema
		Cinema c = new Cinema();
		System.out.print("Enter Theater name: ");
		String cname = sc.nextLine();
		c.setTheaterName(cname);
		System.out.print("Enter Theater Location: ");
		String location = sc.nextLine();
		c.setLocation(location);
		
		// creating showtime
		Showtime s = new Showtime();
		s.setMovie(m);
		s.setCinema(c);
		System.out.print("Enter Show time: ");
		String time = sc.nextLine();
		s.setShowTime(time);
		System.out.print("Enter seats available: ");
		int seats = sc.nextInt();
		sc.nextLine();
		s.setAvailableSeats(seats);
		
		// creating user
		User u = new User();
		System.out.print("Enter Your Name: ");
		String yname = sc.nextLine();
		u.setUsername(yname);
		System.out.print("Enter Your Email: ");
		String email = sc.nextLine();
		u.setEmail(email);
		
		// Booking 
		Booking b = new Booking();
		b.setUser(u);
		b.setShowtime(s);
		System.out.print("Enter seats to book: ");
		int book = sc.nextInt();
		sc.nextLine();
		b.setNumberOfSeats(book);
		System.out.print("Enter Total Price: ");
		double price = sc.nextDouble();
		sc.nextLine();
		b.setTotalprice(price);  // per seat costs 300.00 RS/-
		
		session.save(b);
		session.save(c);
		session.save(u);
		session.save(s);
		session.save(m);
		
		session.getTransaction().commit();
		
		session.close();
		sessionfactory.close();
	}

}
