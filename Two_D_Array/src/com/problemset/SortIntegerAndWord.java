package com.problemset;

public class SortIntegerAndWord {
	
	public static void sortInteger(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int data:arr) {
			System.out.print(data+ " ");
		}
	}
	
	public static void sortWord(String[] arrr) {
		for(int i = 0; i < arrr.length; i++) {
			for(int j = 0; j < arrr.length-1-i; j++) {
				if(arrr[j].compareTo(arrr[j+1]) > 0) {
					String temp = arrr[j];
					arrr[j] = arrr[j+1];
					arrr[j+1] = temp;
				}
			}
		}
		for(String dataa:arrr) {
			System.out.print(dataa+ " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 17, 20, 18, 14, 23, 58, 24, 54, 72, 65, 21, 57, 56};
		String[] arrr = {"Java","Python","PHP","C#","C","C++"};
		
		sortInteger(arr);
		System.out.println();
		sortWord(arrr);

	}

}
