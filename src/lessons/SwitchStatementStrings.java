package lessons;

import java.util.Scanner;

public class SwitchStatementStrings {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		String userInput = "";
		
		// prompt user for input
		System.out.println("Enter any letter in the alpabet: ");
		
		// get user input
		userInput = sc.nextLine();
		

		switch(userInput)  {
		
		case "a":
			System.out.println("You entered \"a\" ");
			break;
		
		case "A":
			System.out.println("You entered \"A\" ");
			break;
		
		case "b": case "B":
			System.out.println("You entered \"b\" or \"B\" ");
			break;
			
		case "c": case "C":
			System.out.println("You entered \"c\" or \"C\" ");
			break;
			
		default:
			System.out.println("You entered a letter above \"c\"");
		}
		
	}

}
