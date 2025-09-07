package in.project;

import java.util.Random;
import java.util.Scanner;

public class NumberPredict {

	public static void main(String[] args) {
		
		int userScore = 0;
		int compScore = 0;
		int round = 0;
		Scanner sc = new Scanner(System.in);

		for(int i = 1; i<=5; i++) {
			Random random = new Random();
			int compIn = random.nextInt(11);
			
			System.out.println("Enter the number between 1 to 10: ");
			int userIn = sc.nextInt();
			
			if(userIn == compIn) {
				userScore++;
				round++;
				System.out.println("User win !!!\n");
				System.out.println("Round "+round+" completed\n");
			}else {
				compScore++;
				round++;
				System.out.println("Computer win !!!\n");
				System.out.println("Round "+round+" completed\n");
			}
			System.out.println("Guessed number was: "+ compIn);
		}
		System.out.println("your score is : " + userScore);
		System.out.println("computer score is : " + compScore);
		
		if(compScore > userScore) {
			System.out.println("Computer win\n");
		}else {
			System.out.println("user win\n");
		}
	}
}
