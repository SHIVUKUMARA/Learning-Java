package in.problem;

import java.util.Scanner;

public class OctalToBinary {

    public static int octalToDecimal(String octal) {
        int decimalValue = 0; 
        int base = 1; 

        for (int i = octal.length() - 1; i >= 0; i--) {
            int digit = octal.charAt(i) - '0';
            decimalValue += digit * base;
            base *= 8;
        }
        return decimalValue; 
    }

    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the octal value: ");
        String octal = sc.nextLine(); 

        int decimal = octalToDecimal(octal);
        String binary = decimalToBinary(decimal);

        System.out.println("The binary equivalent is: " + binary);
    }
}
