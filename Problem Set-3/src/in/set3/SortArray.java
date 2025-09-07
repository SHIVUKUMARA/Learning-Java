//8.	Sort the elements of an array

package in.set3;

public class SortArray {

	public static void main(String[] args) {
		int[] arr = { 99, 23, 45, 67, 33, 29, 39, 41 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int ele : arr) {
			System.out.print(ele + " ");
		}

	}

}
