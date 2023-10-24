package lessons;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		// alternate way to do while loop
		// executes code block at least once

		// variables
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		do  {
		
			System.out.println("Menu");
			System.out.println("1. Say Hello.");
			System.out.println("2. Say Goodbye.");
			System.out.println("3. Exit.");
			System.out.println("Enter Choice: ");
			choice = sc.nextInt();
			
			switch (choice)  {
			
			case 1:
				System.out.println("Hello\n");
				break;
			
			case 2:
				System.out.println("Goodbye\n");
				break;
				
			default:
				System.out.println("Exiting program.");
				
			}

		}  while (choice != 3);
		
	}

}
