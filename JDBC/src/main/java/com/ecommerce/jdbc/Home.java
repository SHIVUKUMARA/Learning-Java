package com.ecommerce.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class Home {

    public static void main(String[] args) throws SQLException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n====== E-commerce System ======");
            System.out.println("Select an option:");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("0. Exit");

            System.out.print("\nEnter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    Register.Register(sc);
                    break;
                case 2:
                    Login.userLogin(sc);
                    break;
                case 0:
                	Thread.sleep(2000);
                    System.out.println("Thank you :)");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        sc.close();
    }
}