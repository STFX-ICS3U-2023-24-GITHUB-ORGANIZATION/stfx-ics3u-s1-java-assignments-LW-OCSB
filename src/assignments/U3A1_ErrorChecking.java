package assignments;

import java.util.Scanner;

public class U3A1_ErrorChecking {

	public static void main(String[] args) {
		
		// variables
		Scanner sc = new Scanner(System.in);
		String userInput = "";
		boolean stageChecked = false;

		// Stage 1
		while (stageChecked == false)  {
			
			System.out.println("Enter String greater than 6 chars: ");
			userInput = sc.next();
			
			stageChecked = stageOne(userInput);	
		}
		
		stageChecked = false;
		
		// Stage 2
		
		
	}

	// DESCRIPTION - Checks if string is greater than 6 chars.
	// PARAMETERS - String s
	// RETURN TYPE - boolean
	public static boolean stageOne(String s)  {
		
		if (s.length() > 6)  {
			return true;
		}
		
		return false;
	}
	
}
