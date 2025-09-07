//23.	Finding Minimum sum of absolute difference of given array

package in.set3;

import java.util.Arrays;

public class MinSumAbsoluteDiff {

	static int sumOfMinAbsDifferences(int arr[]) {
		Arrays.sort(arr);
		int sum = 0;

		sum += Math.abs(arr[0] - arr[1]);

		sum += Math.abs(arr[arr.length - 1] - arr[arr.length - 2]);

		for (int i = 1; i < arr.length - 1; i++)
			sum += Math.min(Math.abs(arr[i] - arr[i - 1]), Math.abs(arr[i] - arr[i + 1]));

		return sum;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 4, 5, 3 };

		System.out.println("Required Minimum Sum is " + sumOfMinAbsDifferences(arr));
	}

}
