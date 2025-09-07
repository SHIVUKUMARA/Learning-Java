package in.set3;

public class NonRepeatingEle {

	public static void main(String[] args) {
		int[] arr = {1, 3, 4, 6, 3, 9, 8, 2, 3};
//		 System.out.println("Non-Repeating elements: ");
        for (int i = 0; i < arr.length; i++) {
            boolean isNonRepeating = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isNonRepeating = false;
                    break;
                }
            }
            if (isNonRepeating) {
                System.out.print(arr[i] + " ");
            }
        }
	}

}
