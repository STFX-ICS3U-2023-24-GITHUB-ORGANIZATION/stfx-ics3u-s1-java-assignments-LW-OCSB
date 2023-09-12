package lessons;

import java.util.Scanner;


public class UserInput {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int age;
		
		// output
		System.out.println("Program determines if you're old enough to drive.");
		System.out.println("Enter your age: ");

		// input integer from user
		age = sc.nextInt();
		
		// determine if old enough to drive
		if (age >= 16)  {
			
			System.out.println("You're old enough to drive in Ontario!");
		}
		
		else  {
			
			System.out.println("You're not old enough to drive in Ontario");
		}
		
		System.out.println("End of program.");

	}

}
