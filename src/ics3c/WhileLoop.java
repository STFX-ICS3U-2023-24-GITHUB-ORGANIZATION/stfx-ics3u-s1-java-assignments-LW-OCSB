package ics3c;
import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		int input = 0;
		
		System.out.println("Enter a number: ");
		input = sc.nextInt();
		
		
		while ( counter < input )  {
			
			System.out.println("Inside block of code.");
			
			counter++;
		}
		
		

	}

}
