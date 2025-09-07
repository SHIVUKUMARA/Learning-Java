package com.inheritance;

class Super{
	int a = 20;
}

class Sub extends Super{
	int a = 30;
	
	public void getA() {
		System.out.println(a);
	}
}

public class Main4 {

	public static void main(String[] args) {
       Sub obj = new Sub();
       obj.getA();
       
       //parent class refers to child class but refering from child class to parent class is not possible
       Super obj1 = new Sub();   //Dynamic(Run-time) polymorphism
       System.out.println(obj1.a);
       
       //for method: check the Object type
       //for variables: check the reference type
	}
}
