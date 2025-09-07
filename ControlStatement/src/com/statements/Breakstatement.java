package com.statements;

public class Breakstatement {

	public static void main(String[] args) {
		// break
		for(int i = 1; i <= 10; i++) {
			if(i == 8) break;
			System.out.println(i + " ");
		}
		
		System.out.println("----------------------");
//		
		for(int i = 1; i <= 3; i++) {
			for(int j = 4; j <= 6; j++) {
				if(j == 5) break;
				System.out.println(i + " " +j);
			}
		}
		
		System.out.println("----------------------");
		
		for(int i = 1; i <= 3; i++) {
			for(int j = 4; j <= 6; j++) {
				if(j == 5) continue;
				System.out.println(i + " " +j);
			}
		}

	}

}
