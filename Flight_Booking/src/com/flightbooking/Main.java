package com.flightbooking;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, InterruptedException {
		System.out.println("Welcome to MMT-Clone");
		Scanner sc = new Scanner(System.in);
		char resp;
		LoginResponse obj = null;
		
		do {
			System.out.println("Select option");
			System.out.println("1.Registration    2.Login");
			int option = sc.nextInt();
			
			switch(option) {
			case 1:UserUtil.registration(sc);
			case 2:obj = UserUtil.login(sc);
			       break;
			       default: System.out.println("Invalid option");
			}
			if(obj.isStatus() == true) {
				System.out.println("Welcome "+obj.getUsername());
				FlightUtil.searchFlight(sc, obj.getUsername());
			}else {
				System.out.println("Login failed...");
			}
			System.out.println("Do you want to continue? y/n");
			resp = sc.next().charAt(0);
		}while(resp == 'y');
        System.out.println("Thanks for using MMT-Clone");
	}

}
