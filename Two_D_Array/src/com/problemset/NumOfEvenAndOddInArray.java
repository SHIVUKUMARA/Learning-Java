package com.problemset;

public class NumOfEvenAndOddInArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		
		int even = 0;
		int odd = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("Total even numbers in array is : "+ even);
		System.out.println("Total odd numbers in array is : "+ odd);
	}

}
