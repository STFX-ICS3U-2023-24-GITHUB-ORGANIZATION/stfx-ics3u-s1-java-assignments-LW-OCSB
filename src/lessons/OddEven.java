package lessons;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		// variables
		Scanner sc = new Scanner(System.in);
		int userInput = 0;
		
		// prompt user for number
		System.out.println("Enter an integer: ");
		userInput = sc.nextInt();
		
		// determine if number is odd or even
		if ( (userInput%2) > 0 )  {
			
			System.out.println("The number is ODD.");
		}
		
		else  {
			System.out.println("The number is EVEN");
		}
		

	}

}
