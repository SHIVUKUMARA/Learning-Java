package in.array;

public class Test2 {
	
	public static void printEven(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
	}
	
	public static int sumOfOddNumbers(int[] arr, int index) {
		if(index == arr.length) {
			return 0;
		}
		
		int sum = 0;
		if(arr[index] % 2 != 0) {
			sum += arr[index];
		}
		return sum + sumOfOddNumbers(arr, index-1);
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		
		printEven(arr);
		sumOfOddNumbers(arr, 0);
		
		System.out.println("Even numbers are : ");
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
		
		System.out.println("Odd numbers are: ");
		for(int data: arr) {
			if(data % 2 != 0) {
				System.out.println(data);
			}
		}
		
		System.out.println("Sum of Odd numbers is : ");
		int sum = 0;
        for(int data:arr) {
        	if(data % 2 != 0) {
        		sum += data;
        	}
        }
        System.out.println(sum);
	}

}
