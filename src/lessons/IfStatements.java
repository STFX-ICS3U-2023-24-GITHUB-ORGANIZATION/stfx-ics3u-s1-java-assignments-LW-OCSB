package lessons;
import java.util.Scanner;

public class IfStatements {

	public static void main(String[] args) {
		
		// variables
		Scanner sc = new Scanner(System.in);
		int userInput = 0;
		
		// output
		System.out.println("Enter a number 1-5: ");
		
		// get input
		userInput = sc.nextInt();
		

		if (userInput == 1)  {
			
			System.out.println("You entered 1.");
		}
		
		else if (userInput == 2)  {
			
			System.out.println("You entered 2.");
		}
		
		else {
			
			System.out.println("You entered a number other than 1 and 2.");
		}
		
		
		
	}

}
