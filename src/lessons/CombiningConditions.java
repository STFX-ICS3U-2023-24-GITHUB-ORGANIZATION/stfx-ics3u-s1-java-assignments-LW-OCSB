package lessons;

import java.util.Scanner;

public class CombiningConditions {

	public static void main(String[] args) {
		
		// variables
		int grade;
		Scanner sc = new Scanner(System.in);
		
		// spash screen
		System.out.println("Program determines if grade is valid.");
		
		// input
		System.out.println("Enter grade: ");
		grade = sc.nextInt();
		
		// test code ...
		System.out.println(grade);
		
		if ( (grade >= 0) && (grade <= 100) )  {
			
			System.out.println("This is a valid grade");
		}
 
		if ( (grade < 0) || (grade > 100) )  {
			
			System.out.println("This is an invalid grade");
		}
			
	}

}
