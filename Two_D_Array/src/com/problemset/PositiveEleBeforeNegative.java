package com.problemset;

public class PositiveEleBeforeNegative {

	public static void main(String[] args) {
		int[] arr = {-4, 8, 6, -5, 6, -2, 1, 2, 3, -11};
		int left = 0;
		int right = arr.length-1;
		
		while(left<right) {
			while(arr[left] > 0 && left < right) {
				left++;
			}
			
			while(arr[right] < 0 && left < right) {
				right--;
			}
			
			if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                
                left++;
                right--;
            }
		}
		
		for(int data:arr) {
			System.out.print(data+" ");
		}

	}

}
