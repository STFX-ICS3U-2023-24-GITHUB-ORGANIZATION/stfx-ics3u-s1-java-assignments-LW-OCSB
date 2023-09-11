package lessons;

import java.util.Scanner;


public class UserInput_P3 {

	public static void main(String[] args) {
		
		// variables
		Scanner sc = new Scanner(System.in);
		int age;
	
		// output
		System.out.println("Program determines if you are old enough to drive.");
		System.out.println("Please enter your age: ");
		
		// input
		age = sc.nextInt();
		
		if (age >= 16)  {
			
			System.out.println("You can drive in Ontario.");
		}
		
		else  {

			System.out.println("You CAN NOT drive in Ontario.");
		}

	}

}
