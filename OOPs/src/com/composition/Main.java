package com.composition;

public class Main {

	public static void main(String[] args) {
		Department d1 = new Department(101, "ISE");
		College c1 = new College(1,"BE",d1);

		System.out.println(c1);
	}

}
