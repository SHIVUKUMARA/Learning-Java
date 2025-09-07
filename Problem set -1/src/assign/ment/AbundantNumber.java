//24.	Abundant number(If the sum of all its proper divisors, denoted by sum(n),
//      is greater than the number's value)


package assign.ment;

import java.util.Scanner;

public class AbundantNumber {

	public static int sum(int n){
        int res = 0;
        for(int i = 1; i < n; i++){
            if(n % i == 0){
                res = res+i;
            }
        }
        return res;
    }
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	       System.out.println("Enter the number : ");
	       int n = sc.nextInt();
	       
	       int r = sum(n);
	       System.out.println("Sum of "+ n + " divisor is "+r);	       
	       if(r < n){
	           System.out.println(r +" < "+ n+" is not a Abandunt number");
	       }else{
	           System.out.println(r +" > "+ n+" is a Abandunt number");
	       }
	}

}
