package lessons;
import java.util.Scanner;


public class NestedIfStatements {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		String dietaryPreference = "";
		String meatChoice = "";
		
		// output
		System.out.println("Food Menu");
		System.out.println("Do you eat Meat (M) or Vegetables (V): ");
		
		// input
		dietaryPreference = sc.next();
		
		if (dietaryPreference.equals("M") || dietaryPreference.equals("m"))  {
			
			System.out.println("Choices are Chicken (C) or Fish (F).");
			
			meatChoice = sc.next();
			
			// THIS IS A NESTED IF STATEMENT
			if (meatChoice.equals("C") || meatChoice.equals("c"))  {
				
				System.out.println("KFC is your meal.");
			}
			
			else if (meatChoice.equals("F") || meatChoice.equals("f"))  {
			
				System.out.println("Filet O Fish is your meal.");
			}
			
			else  {
				
				System.out.println("Invalid input.");
			}
		}
		
		else if (dietaryPreference.equals("V") || dietaryPreference.equals("v")) {
			
			System.out.println("You are a vegetarian.");
		}
		
		else  {
			
			System.out.println("Invalid choice.");
		}
		
	}

}
