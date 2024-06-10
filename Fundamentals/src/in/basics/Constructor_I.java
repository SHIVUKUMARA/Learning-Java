package in.basics;

class Box{
	//Default Constructor
	//className - "class Box{}" and method name - "Box()" should be same otherwise JVM will consider it as normal function.
	static int count = 0;
	Box(){
		System.out.println("Object created");
		count++;
	}
}

public class Constructor_I {

	public static void main(String[] args) {
     Box b = new Box();
     Box b1 = new Box();
     Box b2 = new Box();
     System.out.println("Total count is : "+ Box.count);
	}

}
