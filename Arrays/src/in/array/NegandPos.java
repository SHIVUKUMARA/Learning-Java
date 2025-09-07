package in.array;

public class NegandPos {

	public static void Neg(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void NegPos(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		for(int data:arr) {
			System.out.print(data+" ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };

		Neg(arr);
		System.out.println("--------");
		NegPos(arr);
	}

}
