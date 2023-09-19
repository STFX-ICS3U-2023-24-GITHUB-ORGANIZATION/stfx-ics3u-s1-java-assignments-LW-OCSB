package lessons;
import java.util.Scanner;


public class TryCatch_P1 {

	public static void main(String[] args) {
		
		// variables
		int myInteger = 0;
		Scanner sc = new Scanner(System.in);
		
		// program
		System.out.println("Enter an integer: ");

		try  {
			myInteger = sc.nextInt();
		}
		
		catch (Exception e)  {
			
			
			System.out.println("Incorrect entry!");
		}
		
		// output
		System.out.println("You entered: " + myInteger);
		

	}

}
