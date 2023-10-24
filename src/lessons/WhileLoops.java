package lessons;
import java.util.Scanner;

public class WhileLoops {

	public static void main(String[] args) {
	
		// Used when you want to repeat code
		// for an UNKNOWN number of times

		// variables
		Scanner sc = new Scanner(System.in);
		int myInteger = 1;
		
		// output
		System.out.println("How many times would you like to see Hello?");
		System.out.println("Your choice: ");
		
		// input
		myInteger = sc.nextInt();
		int counter = 0;
		
		while (counter < myInteger)  {

			System.out.println("Hello World!");
			counter++;
		}
		
	}

}
