package in.basics;

class B{
	int data = 29;  //instance variable
	public void m1() {
		int data = 11;   //local variable
		System.out.println("It has local scope "+data);
		System.out.println("It has Instance scope " + this.data);
	}
}

public class This_II {

	public static void main(String[] args) {
        B b = new B();
        b.m1();
	}

}
