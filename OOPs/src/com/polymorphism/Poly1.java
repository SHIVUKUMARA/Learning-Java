package com.polymorphism;

//method overloading
class Dimension{
	public static void area(int r) {
		System.out.println("Area of circle is: "+Math.PI*r*r);
	}
	public static void area(int l, int b) {
		System.out.println("Area of rectangle is: "+l*b);
	}
	public static void area(float side) {
		System.out.println(side*side);
	}
}

public class Poly1 {
public static void main(Integer[] args) {
	System.out.println("Main method can be overloaded");
}
	public static void main(String[] args) {
       Dimension.area(12); //it going  to give area of circle because argument check type of integer
       Dimension.area(7,7);
       Dimension.area(12.3f);
       
       //main method overloading
       Integer[] arr = new Integer[5];
       main(arr);
	}

}
