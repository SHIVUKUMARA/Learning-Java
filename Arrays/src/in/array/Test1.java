package in.array;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
        int[] arr = {11, 13, 14, 15, 12};
        System.out.println("Length is : "+ arr.length);
        
        int[] arr1 = new int[5];
        arr[0] = 21;
        arr[1] = 22;
        arr[2] = 23;
        arr[3] = 24;
        arr[4] = 25;
        
        for(int i = 0; i<arr.length; i++) {
        	System.out.println(arr[i]+ " ");
        }
        
        //Arrays as class
        System.out.println("--------------------");
        System.out.println(Arrays.toString(arr));
        
        //enhanced for loop --> for(int data: arr)
        System.out.println("--------------------");
        for(int data : arr) {
        	System.out.println(data);
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array: ");
        int size = sc.nextInt();
        
        int[] a = new int[size];
        for(int i = 0; i < size; i++) {
        	a[i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");
        
        for(int i = 0; i < size; i++) {
        	System.out.print(a[i] + " ");
        }
	}

}
