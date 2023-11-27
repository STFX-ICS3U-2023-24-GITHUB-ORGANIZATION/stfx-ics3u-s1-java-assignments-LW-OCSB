package lessons;
import java.util.Scanner;

public class Debugging {

	public static void main(String[] args) {
		
		// variables
		Scanner sc = new Scanner(System.in);
		int input = 0;
		
		System.out.println("Enter a number 1-3: ");
		
		input = sc.nextInt();
		
		// print statement to see what was entered
		System.out.println("USER ENTERED: " + input);
		
		if (input == 1)  {
			
			// print statement to see which if statement
			System.out.println("INSIDE FIRST IF");

			int answer = 34;
			System.out.println(answer);
		}
		
		if (input == 2)  {
			
			// print statement to see which if statement
			System.out.println("INSIDE SECOND IF");
			int answer = 17;
			System.out.println(answer);
		}
		
		if (input == 3)  {
			
			// print statement to see which if statement
			System.out.println("INSIDE THIRD IF");
			int answer = 44;
			System.out.println(answer);
		}
		
		

	}

}
