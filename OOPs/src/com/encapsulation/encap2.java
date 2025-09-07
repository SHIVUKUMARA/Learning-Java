package com.encapsulation;

class Box {
	private int length;
	private int breadth;

//	public Box(int length, int breadth) {
//		this.length = length;
//		this.breadth = breadth;
//	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public int getDimensions() {
		return this.length * this.breadth;
	}
}

public class encap2 {

	public static void main(String[] args) {
		Box b = new Box();
		b.setLength(2);
		b.setBreadth(10);
		System.out.println(b.getDimensions());
	}

}
