//15.	Removing Duplicate elements from an array 

package in.set3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesEle {

	public static int duplicate(int[] arr) {
		if (arr.length == 0 || arr.length == 1) {
			return arr.length;
		}
		Arrays.sort(arr);
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[arr.length - 1];  // Add the last element
		return j;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 9, 3, 2, 1, 9, 8, 7, 6, 0 };
		int n = duplicate(arr);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// method - 2
		Set hash_Set = new HashSet();
		for(int i = 0;i<n;i++){
			hash_Set.add(arr[i]);
		}
		System.out.print(hash_Set);
	}
}
