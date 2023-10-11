package lessons;

import java.util.Scanner;

public class SwitchStatementIntegers {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int userInput = 0;
		
		// prompt user to enter number between 1-3
		System.out.println("Enter a number between 1-3: ");
		
		try  {
			// get input from user
			userInput = sc.nextInt();	
		}
		
		catch (Exception e)  {
			System.out.println("You must enter an integer.");
		}
		

		switch (userInput) {
		
			case 1:  
				System.out.println("You entered 1!");
				System.out.println("1 is the best!");
				break;  // to prevent "Switch fall through"
				
			case 2:  
				System.out.println("You entered 2!");
				System.out.println("2 is the best!");
				break;
				
			case 3:  
				System.out.println("You entered 3!");
				System.out.println("3 is the best!");
				break;
				
			default:
				System.out.println("You didn't enter any number between 1-3.");
		}
		
		
		
	}

}
