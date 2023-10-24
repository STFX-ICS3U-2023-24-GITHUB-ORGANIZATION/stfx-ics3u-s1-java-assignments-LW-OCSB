package lessons;
import java.util.Scanner;

public class WhileLoopExample {

	public static void main(String[] args) {
		
		// variables
		Scanner sc = new Scanner(System.in);
		int userInput = 0;
		
		while (userInput != 4)  {
			
			System.out.println("Menu:");
			System.out.println("1. Greeting.");
			System.out.println("2. Quote.");
			System.out.println("3. Joke.");
			System.out.println("4. Exit.");
			System.out.println("Choice: ");
			userInput = sc.nextInt();
			
			if (userInput == 1)  {
				System.out.println("Hello World!");
			}
			
			else if (userInput == 2)  {
				System.out.println("The world is flat.");
			}
			
			else if (userInput == 3)  {
				System.out.println("Hippos hip opottomuses.");
			}
			
		}
		
		System.out.println("\nProgram finished.");
		

	}

}
