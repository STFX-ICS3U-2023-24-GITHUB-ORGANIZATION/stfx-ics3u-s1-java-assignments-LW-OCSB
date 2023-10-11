package sandbox;

import java.util.Scanner;


public class IfElse {

	public static void main(String[] args) {
		
		// variables
		int grade = -1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What grade are you in: ");
		
		grade = sc.nextInt();
		

		if (grade == 0)  {
			
			System.out.println("You're in Kindergarten.");
		}
		
		else if (grade < 7) {
			
			System.out.println("You're in Elementary.");
		}

		else if (grade < 9)  {
			
			System.out.println("You're in Middle.");
		}
		
		else  {
			
			System.out.println("You're in High School.");
		}
		

	}

}
