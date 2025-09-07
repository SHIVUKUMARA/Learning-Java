package in.array;

public class ReverseSortArray {
	
	public static void reverseArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
    }
	
	public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


	public static void main(String[] args) {
		int[] arr = {5, 4, 3, 2, 1};
      
		for(int i = arr.length-1; i>=0 ; i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n--------------------\nusing Swapping method:");
		reverseArray(arr);
		printArray(arr);
	}

}
