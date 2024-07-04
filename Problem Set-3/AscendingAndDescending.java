//7.	Sort first half in ascending order and second half in descending

package in.set3;

public class AscendingAndDescending {

	public static void main(String[] args) {
		int[] arr = { 100, 74, 32, 21, 54, 83, 92, 76, 33 };
		int temp;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length / 2; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			for (int j = arr.length / 2; j < arr.length - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
