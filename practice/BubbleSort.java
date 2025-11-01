package com.practice;
import java.util.Scanner;

public class BubbleSort {
	
	public static void printArr(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void Bubblesort(int[] arr) {
		int n = arr.length;
		boolean swapped;
		
		for(int i = 0; i < n-1; i++) {
			swapped = false;
			
			for(int j = 0; j < n- i - 1; j++) {
				if(arr[j] > arr[j+1]) {
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
					
//					without temp variable
					arr[j] = arr[j] + arr[j+1];
					arr[j+1] = arr[j] - arr[j+1];
					arr[j] = arr[j] - arr[j+1];
					
					swapped = true;
				}
			}
			if(!swapped) break;
		}
	}

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter the size of array : ");
      int n = sc.nextInt();
      
      int[] arr = new int[n];
      
      System.out.println("Enter " + n +" the array Elements : ");
      for(int i = 0; i < n; i++) {
    	  arr[i] = sc.nextInt();
      }
      
      System.out.print("Array before Sorting :");
      printArr(arr);
      
      Bubblesort(arr);
      
      System.out.print("\nArray after Sorting : ");
      printArr(arr);
      
      sc.close();
	}

}
