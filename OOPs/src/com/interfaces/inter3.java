package com.interfaces;

interface A2{
	//public static and final
	int a = 100;
}

public class inter3 {

	public static void main(String[] args) {
       System.out.println(A2.a);
       //A2.a = 300;  // by default a is a final so it can't be changed so it is giving an complie time error
	}

}
