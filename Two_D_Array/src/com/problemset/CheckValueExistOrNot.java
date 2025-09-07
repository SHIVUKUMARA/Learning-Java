package com.problemset;

import java.util.Scanner;

public class CheckValueExistOrNot {

	public static void main(String[] args) {
		int[] arr = { 17, 20, 18, 14, 23, 58, 24, 54, 72, 65, 21, 57, 56};
        
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element: ");
		int ele = sc.nextInt();
		
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] == ele) {
				System.out.println("The index of array element "+ ele +" is : "+ i);
			}
		}
			System.out.println("Element doesn't exist!!!");
	}

}
