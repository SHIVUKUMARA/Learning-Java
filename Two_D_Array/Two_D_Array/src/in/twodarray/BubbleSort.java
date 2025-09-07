package in.twodarray;

public class BubbleSort {
	
	public static void sortValues(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int flag = 0;
			for(int j = 0; j < arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag=1;
				}
			}
			if(flag == 0) {
				break;
			}
		}
		System.out.println("Bubble sort of array is : ");
		for(int data:arr) {
			System.out.print(data+" ");
		}
		System.out.println("\n");
	}
	
	public static void sortWords(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int flag = 0;
			for(int j = 0; j < arr.length-1-i; j++) {
				if(arr[j].compareTo(arr[j+1])>0) {
					String temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag=1;
				}
			}
			if(flag == 0) {
				break;
			}
		}
		System.out.println("Bubble sort of array is : ");
		for(String data:arr) {
			System.out.print(data+" ");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		int[] arr = {30, 19, 29, 12, 5};
		int[] arr1 = {-10, -62, 77, 21, -1, 3, 33, 94, 76, 48, -77, 44};
		String[] arr2 = {"deepak", "ravi", "kiran", "rajesh", "krishna"};
		
		sortValues(arr);
		sortValues(arr1);
		sortWords(arr2);

	}

}


/*int[] arr = {30, 19, 29, 12, 5};
 * Working of bubble sort
 * Round 1-------------->
 * 
 * 30,19,29,12,5   ---initial
 * 19,30,29,12,5   ---checks first two elements, 30 > 19 if true swap both element else return as it is
 * 19,29,30,12,5   ---checks next two elements,checks 30 > 29 if true swap both element else return as it is
 * 19,29,12,30,5   ---checks next two elements,checks 30 > 12 if true swap both element else return as it is
 * 19,29,12,5,30   ---checks next two elements,checks 30 > 5 if true swap both element else return as it is
 * 19,29,12,5,30   ---round 1 completed
 * 
 * Round 2-------------->
 * 19,29,12,5,30   ---round 1 final sort array
 * 19,29,12,5,30   ---checks first two elements, 19 > 29 if true swap both element else return as it is
 * 19,12,29,5,30   ---checks first two elements, 29 > 12 if true swap both element else return as it is
 * 19,12,5,29,30   ---checks first two elements, 29 > 5 if true swap both element else return as it is
 * 19,12,5,29,30   ---checks first two elements, 29 > 30 if true swap both element else return as it is
 * 19,12,5,29,30   ---round 2 completed
 * 
 * Round 3--------------->
 * 19,12,5,29,30   ---round 2 final sort array
 * 19,12,5,29,30   ---checks first two elements, 19 > 12 if true swap both element else return as it is
 * 12,5,19,29,30   ---checks first two elements, 19 > 5 if true swap both element else return as it is
 * 12,5,19,29,30   ---checks first two elements, 19 > 29 if true swap both element else return as it is
 * 12,5,19,29,30   ---checks first two elements, 29 > 30 if true swap both element else return as it is
 * 12,5,19,29,30   ---round 3 completed
 * 
 * Round 4--------------->
 * 12,5,19,29,30   ---round 3 final sort array
 * 5,12,19,29,30   ---checks first two elements, 5 > 12 if true swap both element else return as it is
 * 5,12,19,29,30   ---checks first two elements, 12 > 19 if true swap both element else return as it is
 * 5,12,19,29,30   ---checks first two elements, 19 > 29 if true swap both element else return as it is
 * 5,12,19,29,30   ---checks first two elements, 29 > 30 if true swap both element else return as it is
 * 5,12,19,29,30   ---round 4 completed final sorted array
 */