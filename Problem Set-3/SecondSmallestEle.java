//4.	Find Second Smallest Element in an Array

package in.set3;

public class SecondSmallestEle {

	static int secSmallest(int arr[], int n) {
		int smallest = arr[0];
		for (int i = 0; i < n; i++) {
			if (arr[i] < smallest)
				smallest = arr[i];
		}
		int sec_smallest = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (arr[i] != smallest && arr[i] < sec_smallest)
				sec_smallest = arr[i];
		}
		return sec_smallest;
	}

	public static void main(String[] args) {
		int arr[] = { 12, 13, 1, 10, 34, 10 };
		int n = arr.length;
		System.out.print(secSmallest(arr, n));
	}

}
