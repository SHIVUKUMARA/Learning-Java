package com.flightbooking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlightUtil {
	
	static List<Flight> flights = new ArrayList<>();
	private static Connection con;
	
	public static void searchFlight(Scanner sc, String username) throws ClassNotFoundException, SQLException, InterruptedException {
		con = DBConfiguration.getConnection();
		System.out.print("Enter the source: ");
		String source = sc.next();
		System.out.print("Enter the destination: ");
		String destination = sc.next();
		
		PreparedStatement ps = con.prepareStatement("select * from flight where source = ? and destination = ?");
		ps.setString(1, source);
		ps.setString(2, destination);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			Flight flight = new Flight();
			flight.setFlightid(rs.getString(1));
			flight.setSource(rs.getString(2));
			flight.setDestination(rs.getString(3));
			flight.setSeats(rs.getInt(4));
			flights.add(flight);
		}
		if(!flights.isEmpty()) {
			System.out.println("Flight Details: ");
			System.out.println("-------------------------------------------------------------------------");
			for(Flight flight:flights) {
				System.out.println("FlightId       : "+ flight.getFlightid());
				System.out.println("Source         : "+flight.getSource());
				System.out.println("Destination    : "+flight.getDestination());
				System.out.println("Seats Avaliable: "+flight.getSeats());
				System.out.println("---------------------------------------------------------------------");
			}
			System.out.println("Enter flightid to book a ticket : ");
			String flightid = sc.next();
			
			for(int i = 0; i < flights.size(); i++) {
				if(flights.get(i).getFlightid().equals(flightid)) {
					bookTickets(flights.get(i), username, sc);
					break;
				}
			}
		}else {
			System.out.println("Sorry no flights are available from "+source+ " to "+destination);
		}
	}
	
	public static void bookTickets(Flight flight, String username, Scanner sc) throws InterruptedException, SQLException {
		
		Connection con = DBConfiguration.getConnection();
		
		System.out.println("Enter the number of seats to book: ");
		int requiredSeats = sc.nextInt();
		int availableSeats = flight.getSeats();
		System.out.println("Please wait... Checking for availability");
		Thread.sleep(3000);
		if(requiredSeats <= availableSeats) {
			availableSeats -= requiredSeats;
			PreparedStatement ps = con.prepareStatement("update flight set seats = ? where flightid = ?");
			ps.setInt(1, availableSeats);
			ps.setString(2, flight.getFlightid());
			int i = ps.executeUpdate();
			if(i > 0) {
				System.out.println("Ticket booked Successfully");
				printBoardingPass(flight.getFlightid(),username, flight.getSource(), flight.getDestination());
			}
		}else {
			System.out.println("Seats are not avaliable !!!");
		}
	}
	
	public static void printBoardingPass(String flightid, String username, String src, String dest) {
		System.out.println("\n=========================================================================");
		System.out.println("Your boarding pass for upcoming flight");
		System.out.println("---------------------------------------------------------------------------");
		
		System.out.println("Passanger-Name: "+ username);
		System.out.println("Source        : "+ src);
		System.out.println("Destination   : "+ dest);
		
		System.out.println("\nThanks for Flying with us -"+ flightid);
	}
}
