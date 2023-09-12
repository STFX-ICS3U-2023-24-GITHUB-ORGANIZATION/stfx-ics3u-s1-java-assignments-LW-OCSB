package lessons;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		
		// variables
		int mark;
		Scanner sc = new Scanner(System.in);

		// spash screen
		System.out.println("Program determines level based on numeric grade");
		
		// prompt user for input
		System.out.println("Enter numeric grade: ");
		
		// get user input
		mark = sc.nextInt();
		
		// determine if Level 0
		if (mark < 50)  {
			
			System.out.println("Level 0");
		}
		
		else if (mark < 60)  {
			
			System.out.println("Level 1");
		}
		
		else if (mark < 70)  {
			
			System.out.println("Level 2");
		}
		
		else if (mark < 80)  {
			
			System.out.println("Level 3");
		}
		
		else  {
			
			System.out.println("Level 4");
		}
		
		
		System.out.println("End of program.");
	}

}
