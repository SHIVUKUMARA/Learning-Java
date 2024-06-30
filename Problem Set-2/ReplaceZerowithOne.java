package in.problem;

import java.util.Scanner;

public class ReplaceZerowithOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
        int number = sc.nextInt();
        
        String str = Integer.toString(number);
        String str1 = "";
        
        for(int i = 0; i < str.length(); i++) {
        	if(str.charAt(i) == '0') {
        		str1 = str1+'1';
        	}else {
        		str1 = str1+str.charAt(i);
        	}
        }
        System.out.println("The converted number is : "+ str1);
	}

}
