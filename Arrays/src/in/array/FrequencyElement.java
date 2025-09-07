package in.array;

import java.util.Scanner;

public class FrequencyElement {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 4, 5, 4, 6, 7, 4, 2, 1, 3, 2, 7};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check frequency: ");
        int freq = sc.nextInt();
        
		int count = 0;
		
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] == freq) {
				count++;
			}
		}
		System.out.println("The frequency of "+freq+" is "+count);

	}

}
