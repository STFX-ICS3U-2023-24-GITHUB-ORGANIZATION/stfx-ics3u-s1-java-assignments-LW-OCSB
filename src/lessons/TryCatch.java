package lessons;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		
		// variables
		int myInteger = 0;
		Scanner sc = new Scanner(System.in);
		
		// program
		System.out.println("Enter an integer: ");
		
		try  {
			
			myInteger = sc.nextInt();
		}
		
		catch(Exception e) {
			
			System.out.println("You made an incorrect entry, try again.");	
		}
		
		
		
		System.out.println("You just entered the number: " + myInteger);
		
		

	}

}
