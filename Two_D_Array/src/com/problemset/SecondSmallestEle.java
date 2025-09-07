package com.problemset;

public class SecondSmallestEle {

	public static void main(String[] args) {
		int[] arr = {4, 6, 7, 9, 10, 45, 100};

        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;
        
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] < smallest) {
        		secondsmallest = smallest;
        		smallest = arr[i];
        	}else if(arr[i] < secondsmallest && arr[i] != smallest) {
        		secondsmallest = arr[i];
        	}
        }
        
        if (secondsmallest == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest element");
        } else {
            System.out.println("The second smallest element is: " + secondsmallest);
        }

	}

}
