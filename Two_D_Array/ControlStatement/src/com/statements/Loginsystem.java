package com.statements;
import java.util.Scanner;

public class Loginsystem{
    class DB{
    	static final String username = "Admin";
    	static final String password = "Admin@123";
    }
    
    class loginSystem{
    	public static void validation(Scanner sc) {
    		System.out.println("Enter the userName: ");
    		String userName = sc.next();
    		if(userName.equals(DB.username)) {
    			System.out.println("Enter your Password: ");
    			String Password = sc.next();
    			if(Password.equals(DB.password)) {
    				System.out.println("Welcome " + userName);
    			}else {
    				System.out.println("Invalid password");
    			}
    		}else {
    			System.out.println("Invalid userName");
    		}
    }
}
	public static void main(String[] args) {
       loginSystem.validation(new Scanner(System.in));
	}

}
