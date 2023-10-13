package lessons;
import java.util.Scanner;

public class NestedIfStatements {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		String dietaryPreference = "";
		String meatChoice = "";
		// Output
		System.out.println("Food Menu");
		System.out.println("Do you eat meat (M) or vegetables (V)?");
		
		// User input for dietary preference
		// Assume user enters either "M", "m", "V" or "v"
		dietaryPreference = sc.next();
		

		// determine which dietary preference
		if (dietaryPreference.equals("M")  ||  dietaryPreference.equals("m") )  {
			
			System.out.println("Would you like Chicken (C) or Fish (F)?");
			
			meatChoice = sc.next();
			
			// nested if statement
			if ( meatChoice.equals("C") || meatChoice.equals("c") )  {

				System.out.println("Your meal will be KFC!");
			}
			
			else if ( meatChoice.equals("F") || meatChoice.equals("f") )  {

				System.out.println("Your meal will be Fillet O Poisson!");
			}
			
			else  {
				System.out.println("Invalid meat choice.");
			}
			
		}
		
		else if (dietaryPreference.equals("V")  || dietaryPreference.equals("v") ) {
			
			System.out.println("You are a vegetarian.");
		}
		
		else  {
			
			System.out.println("Invalid selection.");
		}
		
		
		
	}

}
