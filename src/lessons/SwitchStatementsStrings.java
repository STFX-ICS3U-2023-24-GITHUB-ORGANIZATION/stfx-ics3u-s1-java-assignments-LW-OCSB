package lessons;
import java.util.Scanner;

public class SwitchStatementsStrings {

	public static void main(String[] args) {
		
		// variables
		Scanner sc = new Scanner(System.in);
		String userInput = "";
		
		// output
		System.out.println("Enter any of the first 3 letters in alphabet: ");
		
		// input
		userInput = sc.nextLine();
		
		switch (userInput)  {
		
		case "a":
			System.out.println("You entered the letter \"a\" ");
		
		case "A":
			System.out.println("You entered the letter \"A\" ");
		
		case "b": case "B":
			System.out.println("You entered the letter \"b\" or \"B\"");
			
		case "c": case "C":
			System.out.println("You entered the letter \"c\" or \"C\"");
		
		default:
			System.out.println("You entered a letter above \"c\"");
		}

	}

}
