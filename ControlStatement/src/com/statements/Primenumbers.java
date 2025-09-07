package com.statements;

public class Primenumbers {

    public static void main(String[] args) {
        for (int num = 1; num <= 100; num++) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
