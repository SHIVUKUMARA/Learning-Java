package in.project;

import java.util.Scanner;

class BankServer {
    static String StoredNo;
    static int Amount;
    
    BankServer(String StoredNo, int Amount) {
        this.StoredNo = StoredNo;
        this.Amount = Amount;
    }
    
    public static void depositAmount(int amount) {
        Amount += amount;
    }
    
    public static void withdrawAmount(int amount) {
        Amount -= amount;
    }
}

class BankUtil {
    
    static BankServer bs;
    
    public static void validation(Scanner sc) {
        for(int attempt = 1; attempt <= 3; attempt++) {
            System.out.println("Enter the Card No: ");
            String CardNo = sc.nextLine();
            
            if(CardNo.equals(bs.StoredNo)) {
                System.out.println("Login Successful :)");
                
                char res;
                do {
                    System.out.println("");
                    System.out.println("1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit\n");
                    int option = sc.nextInt();
                    
                    switch(option) {
                        case 1: checkBalance();
                                break;
                        case 2: deposit(sc);
                                break;
                        case 3: withdraw(sc);
                                break;
                        case 4: System.out.println("Thank you for using our service.");
                                return;
                        default: System.out.println("Invalid Option");
                    }
                    System.out.println("Do you want to continue? y/n");
                    res = sc.next().charAt(0);
                    sc.nextLine();
                } while(res == 'y');
                System.out.println("Transaction completed..");
                break;        	
            } else {
                System.out.println("Invalid Card No");
                System.out.println(3 - attempt + " Attempts left");
                
                if(attempt == 3) {
                    System.out.println("You have reached Maximum " + attempt + " attempts");
                    System.out.println("Your Card is Blocked for 24-hours");
                }
            }
        }
    }
    
    public static void checkBalance() {
        int balance = bs.Amount;
        System.out.println("Your current balance is: " + balance + " Rs");
    }
    
    public static void deposit(Scanner sc) {
        System.out.println("Enter the amount to deposit: ");
        int depositAmount = sc.nextInt();
        
        if(depositAmount > 0) {
            bs.depositAmount(depositAmount);
            System.out.println("Successfully deposited " + depositAmount + " Rs");
            checkBalance();
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive amount.");
        }
    }
    
    public static void withdraw(Scanner sc) {
        System.out.println("Enter the amount to withdraw: ");
        int withdrawAmount = sc.nextInt();
        
        if(withdrawAmount > 0) {
            if(bs.Amount - withdrawAmount >= 500) {
                bs.withdrawAmount(withdrawAmount);
                System.out.println("Successfully withdraw of: " + withdrawAmount + " Rs");
                checkBalance();
            } else {
                System.out.println("Insufficient balance. Your account must maintain a minimum balance of 500 Rs.");
                checkBalance();
            }
        } else {
            System.out.println("Invalid withdrawal amount. Please enter a positive amount.");
        }
    }
}

public class ATMInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to My Bank :)");
        BankServer bs = new BankServer("2345", 500);
        
        BankUtil.bs = bs;
        
        BankUtil.validation(sc);
    }
}
