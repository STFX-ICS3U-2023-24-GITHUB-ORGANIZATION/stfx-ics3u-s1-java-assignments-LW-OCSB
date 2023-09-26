package lessons;
import java.util.Scanner;


public class OddEven_P1 {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int userInput = 0;
		
		// prompt user for integer
		System.out.println("Enter an integer: ");
		userInput = sc.nextInt();
		
		// determine if integer is odd or even
		if (userInput%2 > 0)  {
			
			System.out.println("Integer is ODD.");
		}
		
		else  {
			System.out.println("Integer is EVEN");
		}
		
	}

}
