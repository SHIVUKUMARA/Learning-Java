//6.	Reverse an Array

package in.set3;

public class ReverseArray {
	
	public static void reverse(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		int[] arr = {1, 3, 4, 5, 7, 8, 9};
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		reverse(arr);
	}

}
