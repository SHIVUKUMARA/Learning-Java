//18.	Power of a number 

package assign.ment;

import java.util.Scanner;

public class PowerOfNum {
	
	public static int pow(int n, int m) {
    	int result = 1;
    	for(int i = 0; i<m; i++) {
    		result*=n;
    	}
    	return result;
    }
	
//	using recursion
//	public static int pow(int n, int m) {
//	   if(m == 0) {
//		   return 1;
//	   }else {
//		   return n * pow(n, m-1);
//	   }
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number: ");
        int n = sc.nextInt();
        
        System.out.println("Enter the Second number: ");
        int m = sc.nextInt();
        
		int result = pow(n,m);
		System.out.println(result);

	}

}
