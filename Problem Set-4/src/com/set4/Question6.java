//6.	Minimize the maximum difference between heights 

package com.set4;

import java.util.Arrays;

public class Question6 {
	
	public static int getMinDiff(int[] arr, int n, int k)
	{

		Arrays.sort(arr);
		int ans = (arr[n - 1] + k)- (arr[0] + k); 

		int tempmax = arr[n - 1] - k; 
		int tempmin = arr[0] + k; 
		int max, min;

		for (int i = 0; i < n - 1; i++) {
			if (tempmax > (arr[i] + k)) {
				max = tempmax;
			}
			else {
				max = arr[i] + k;
			}

			if (tempmin < (arr[i + 1] - k)) {
				min = tempmin;
			}
			else {
				min = arr[i + 1] - k;
			}

			if (ans > (max - min)) {
				ans = max - min;
			}
		}
		return ans;
	}
	public static void main(String[] args) {

		int[] arr = { 7, 4, 8, 7, 3, 9 };
		int k = 6;
		int ans = getMinDiff(arr, arr.length, k);
		System.out.println(ans);
	}

}
