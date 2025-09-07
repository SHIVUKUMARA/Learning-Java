//5.	Calculate the sum of elements in an array 

package in.set3;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 6, 9, 11, 4};
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);

	}

}
