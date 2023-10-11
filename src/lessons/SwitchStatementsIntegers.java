package lessons;
import java.util.Scanner;

public class SwitchStatementsIntegers {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int userInput = 0;
		
		// output
		System.out.println("Enter an integer 1-3: ");
		
		// input
		try  {
			userInput = sc.nextInt();
		}
		
		catch (Exception e)  {
			
			System.out.println("Invalid entry.");
		}
		
		switch (userInput)  {
		
			case 1:
				System.out.println("You entered 1.");
				System.out.println("1 is the best!");
				break;  // to prevent "switch fall through"
				
			case 2:
				System.out.println("You entered 2.");
				System.out.println("2 is the best!");
				break;
				
			case 3:
				System.out.println("You entered 3.");
				System.out.println("3 is the best!");
				break;
				
			default:
				System.out.println("You didn't enter 1-3!");
		}

	}

}
