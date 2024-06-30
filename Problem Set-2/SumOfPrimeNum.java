//17.	Can a number be expressed as a sum of two prime numbers using Java?

package in.problem;

import java.util.Scanner;

public class SumOfPrimeNum {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean sumOfTwoPrimes(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (isPrime(i) && isPrime(n - i)) {
                System.out.println(n + " can be expressed as the sum of " + i + " and " + (n - i));
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (!sumOfTwoPrimes(number)) {
            System.out.println(number + " cannot be expressed as the sum of two prime numbers.");
        }
    }
}
