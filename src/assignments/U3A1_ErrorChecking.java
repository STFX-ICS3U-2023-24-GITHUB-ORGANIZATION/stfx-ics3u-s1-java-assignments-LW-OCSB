package assignments;
import java.util.Scanner;

public class U3A1_ErrorChecking {

	public static void main(String[] args) {
		
		// variables
		Scanner sc = new Scanner(System.in);
		String userInput = "";
		boolean stageChecked = false;
		
		// Stage 1 - enter a string greater than 6 characters long
		while (stageChecked == false)  {
			
			System.out.println("Enter a String that's greater than 6 characters.");
			userInput = sc.next();
			
			stageChecked = stageOne(userInput);
		}
		
		// Stage 2 -
		System.out.println("Onto stage 2 ...");
		
	}

	// DESCRIPTION - Determines if String is greater than 6 characters.
	// PARAMETERS - String s
	// RETURN TYPE - boolean
	public static boolean stageOne(String s)  {
		
		if (s.length() > 6)  {
			return true;
		}
		
		else
			return false;
	}
	
	
	
	
	
}
