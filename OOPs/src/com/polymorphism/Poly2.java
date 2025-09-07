package com.polymorphism;

class Vehicle{
	int numOfWheels = 4;
	public String speed() {
		return "60 km/hr";
	}
}

class Car extends Vehicle{
	@Override
	public String speed() {
		return "120 km/hr";
	}
}

class Bike extends Vehicle{
	int numOfWheels = 2;
	@Override
	public String speed() {
		return "100 km/hr";
	}
}

public class Poly2 {

	public static void main(String[] args) {
       Bike bike = new Bike();
       System.out.println(bike.speed()); //first check in the child class bike and return value
                                         //else it check parent class and return the value
       
       System.out.println("----------------------------------------");
       System.out.println("Combinaton of object ceation");
       
       Vehicle v1 = new Bike();
       System.out.println(v1.speed());  // calls the child method because object reference
       System.out.println(v1.numOfWheels);  //calls the parent method because parent or variable reference
	}

}
