package com.statements;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter rows: ");
		int numOfRows = sc.nextInt();

		System.out.println("Enter cols: ");
		int numOfCols = sc.nextInt();

		for (int i = 1; i <= numOfCols; i++) {
			for (int j = 0; j < numOfRows; j++) {
				int count = i + j * numOfCols;
				if (count < 10) {
					System.out.print("0" + count + "  ");
				} else {
					System.out.print(count + "  ");
				}
			}
			System.out.println();
		}
	}

}
