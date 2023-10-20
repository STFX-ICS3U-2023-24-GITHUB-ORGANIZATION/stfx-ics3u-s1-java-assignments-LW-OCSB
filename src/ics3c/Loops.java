package ics3c;
import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = 0;
		
		System.out.println("How many times to say hello? ");
		input = sc.nextInt();
		
		for (int i=0; i<input; i++)
		{
			
			System.out.println("Hello World!");
		}
		
		
		
	}

}
