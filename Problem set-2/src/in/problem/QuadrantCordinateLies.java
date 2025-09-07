package in.problem;

import java.util.Scanner;

public class QuadrantCordinateLies {
	
	public static void cordinates(int x, int y) {
		if(x>0 && y>0) {
			System.out.println("Quadrant-I");
		}else if(x<0 && y>0) {
			System.out.println("Quadrant-II");
		}else if(x<0 && y<0) {
			System.out.println("Quadrant-III");
		}else if(x>0 && y<0) {
			System.out.println("Quadrant-IV");
		}else if(x==0 && y==0) {
			System.out.println("Origin");
		}else if(y==0 && x!=0) {
			System.out.println("X-axis");
		}else if(x==0 && y!=0) {
			System.out.println("Y-axis");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 'X' value : ");
		int x = sc.nextInt();
		
		System.out.println("Enter the 'Y' value : ");
		int y = sc.nextInt();
		
		cordinates(x,y);

	}

}
