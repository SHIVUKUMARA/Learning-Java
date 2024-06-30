//19.	Find the prime numbers between 1 to 100 

package in.problem;

public class PrimeNum1to100 {

	public static void main(String[] args) {
		int n1 = 1;
		int n2 = 100;
        System.out.println("Prime numbers between " + n1 + " and " + n2 + " are:");
        for (int i = n1; i <= n2; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

	}

}
