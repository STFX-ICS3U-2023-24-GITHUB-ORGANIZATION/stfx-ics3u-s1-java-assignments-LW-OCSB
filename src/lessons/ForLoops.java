package lessons;
import java.util.Scanner;

public class ForLoops {

	public static void main(String[] args) {
		
		// variables
		int numRepeats = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many times would you would like to see Hello World: ");
		
		try  {
			numRepeats = sc.nextInt();
		}
		
		catch (Exception e)  {
			System.out.println("Incorrect Entry, end of program.");
		}
		
		// int i=0;  create counter starting at zero
		// i<5;      repeat block of code as long as counter is less than 5
		// i++;      add 1 to counter after each iteration the block of code
		for (int i=0; i<numRepeats; i++)  {  
			
			System.out.println("i = " + i);
		}
	}

}
