//9.	Finding the frequency of elements in an array 

package in.set3;

import java.util.Scanner;

public class FrequencyOfEle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find frequency: ");
		int num = sc.nextInt();
		
		int[] arr = {1, 3, 6, 1, 6, 3, 7, 2, 1, 6, 7, 8, 0, 9};
        int count = 0;
        
        
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] == num) {
        		count++;
        	}
        }
        System.out.println(count);
	}

}
