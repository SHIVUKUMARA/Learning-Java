//20.	Finding Arrays are disjoint or not

package in.set3;

public class DisjointOrNot {
	
	public static boolean disjoint(int[] arr1, int[] arr2) {
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr2 = {60, 70, 80, 90, 100};

		if(disjoint(arr1, arr2)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		int arr3[] = {10, 51, 3, 43, 6};
        int arr4[] = {80, 71, 29, 3};
        
        if(disjoint(arr3, arr4)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
