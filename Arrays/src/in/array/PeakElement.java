package in.array;

public class PeakElement {

	public static boolean ascending(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static boolean descending(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static void peak(int[] arr) {
		if (ascending(arr) || descending(arr)) {
			System.out.println("The array is sorted,peak element is:");
			if(ascending(arr)) {
				System.out.println(arr[arr.length-1]);
			}else {
				System.out.println(arr[0]);
			}
			return;
		}

		System.out.println("The peak elements are: ");
		// Check for the first element
		if (arr.length > 1 && arr[0] > arr[1]) {
			System.out.println(arr[0]);
		}
		// Check for the elements in the middle
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
				System.out.println(arr[i]);
			}
		}
		// Check for the last element
		if (arr.length > 1 && arr[arr.length - 1] > arr[arr.length - 2]) {
			System.out.println(arr[arr.length - 1]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 1};
		int[] arr1 = {1, 2, 3, 4};
		int[] arr2 = {1,3,4,5,6,4,2,1,8,9,5,6,0,2,5};

		peak(arr);
		peak(arr1);
		peak(arr2);
	}

}
