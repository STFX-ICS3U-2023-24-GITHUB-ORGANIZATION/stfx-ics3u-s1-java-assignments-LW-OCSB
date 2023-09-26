package sandbox;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		
		
		
		
		// variables
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int answer = 0;
	
		System.out.println("Enter num1: ");
		num1 = sc.nextInt();
		System.out.println("You entered " + num1);
		System.out.println("Enter num2: ");
		num2 = sc.nextInt();
		System.out.println("You entered " + num2);
		
		answer = num1 + num2;
		System.out.println("num1" + " + " + "num2 = " + answer);

	}

}
