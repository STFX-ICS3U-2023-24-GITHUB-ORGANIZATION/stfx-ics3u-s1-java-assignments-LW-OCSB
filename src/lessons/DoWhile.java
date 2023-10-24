package lessons;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		do  {
			
			System.out.println("Menu");
			System.out.println("1. Say Hello.");
			System.out.println("2. Say Goodbye.");
			System.out.println("3. Exit");
			System.out.println("Enter choice: ");
			
			choice = sc.nextInt();
			
			switch (choice)  {
				
				case 1:
					System.out.println("Hello!");
					break;
				
				case 2:
					System.out.println("Goodbye!");
					break;
				
				default:
					System.out.println("Exiting program.");
			
			}
			
		}  while (choice != 3);

	}

}
