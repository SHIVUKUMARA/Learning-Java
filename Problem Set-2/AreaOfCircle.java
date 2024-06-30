//Find the area of circle

package in.problem;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius of circle: ");
        double radius = sc.nextDouble();
        
        double area = 3.14 * radius * radius;
        System.out.println("The area of circle is : "+ area);
	}

}
