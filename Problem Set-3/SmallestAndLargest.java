//3.	Find the Smallest and largest element in an array

package in.set3;

public class SmallestAndLargest {

	public static void main(String[] args) {
		int[] arr = {22, 21, 11, 45, 2, 6, 27, 71};
		int smallest = arr[0];
		int largest = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(smallest > arr[i]) {
				smallest = arr[i];
			}
			if(largest < arr[i]) {
				largest = arr[i];
			}
		}
        System.out.println(smallest);
        System.out.println(largest);
	}

}
