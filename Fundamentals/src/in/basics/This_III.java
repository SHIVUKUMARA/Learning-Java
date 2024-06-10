package in.basics;

class Rectangle{
	int length;   //instance variable
	int breadth;  //instance variable
	
	Rectangle(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
		
		//length = length    --- local variable
		//breadth = breadth  --- local variable
	}
	
	public void getArea() {
		System.out.println(length*breadth);
		System.out.println(this.length * this.breadth);
	}
}

public class This_III {

	public static void main(String[] args) {
       Rectangle rectangle = new Rectangle(12,12);
       rectangle.getArea();
	}

}
