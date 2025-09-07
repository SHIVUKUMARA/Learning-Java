package in.twodarray;

import java.util.Scanner;

public class SetToZero {
	
	public static void zero(int row, int col, int[][] arr) {
		System.out.println("updated array: ");
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				if(i == row || j == col) {
					arr[i][j] = 0;
				}
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Row number: ");
		int row = sc.nextInt();
		
		System.out.println("Enter the Column number: ");
		int col = sc.nextInt();
		
		System.out.println("Original Array: ");
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		zero(row, col, arr);
	}

}
