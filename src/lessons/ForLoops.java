package lessons;
import java.util.Scanner;

public class ForLoops {

	public static void main(String[] args) {
		
		// variables
		Scanner sc = new Scanner(System.in);
		int userInput = 0;
		
		System.out.println("How many times to print Hello World: ");
		
		try  {
			userInput = sc.nextInt();
		}
		
		catch (Exception e)  {
			System.out.println("Invalid input, end of program.");
		}
		
		for (int i=0; i<userInput; i++)  {
			System.out.println("Hello World!");
		}
	
		
	}

}
