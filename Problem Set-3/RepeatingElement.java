//13.	Finding Repeating elements in an Array

package in.set3;

public class RepeatingElement {

	public static void main(String[] args) {
		int[] arr = {1, 3, 4, 1, 2, 3, 4, 6, 8, 9};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.print(arr[j]+" ");
				}
			}
		}
	}
}