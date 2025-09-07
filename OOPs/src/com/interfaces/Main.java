package com.interfaces;

public class Main {

	public static void main(String[] args) {
		Department dept = new Department();
		Canteen cant = new Canteen();
		Library lib = new Library();
		College obj = new College(101, "ABC",lib);
        System.out.println(obj.getInfo());
	}

}
