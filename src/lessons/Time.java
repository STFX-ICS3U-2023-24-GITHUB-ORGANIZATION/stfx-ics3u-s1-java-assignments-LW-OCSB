package lessons;
import java.util.Scanner;

public class Time {

	public static void main(String[] foo)  {
	    
		// variables
		Scanner sc = new Scanner(System.in);
		int userInput = 0;
		int numberOfHours = 0;
		int remainingSeconds = 0;
		int numberOfMinutes = 0;
		int numberOfSeconds = 0;
		
		// get number of seconds from user
		System.out.println("Enter total number of seconds:" );
		
		try {
			
			userInput = sc.nextInt();
		}
	
		catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		// Calculate number of hours
		numberOfHours = userInput / 3600;
		
		// Calculate remaining seconds    
		remainingSeconds = userInput % 3600;
		
		// Calculate minutes
		numberOfMinutes = remainingSeconds/60;
		
		// Calculate seconds
		numberOfSeconds = remainingSeconds%60;
		
		// Output hours, minutes and seconds
		System.out.println("Number of hours: " + numberOfHours);
		System.out.println("Number of minutes: " + numberOfMinutes);
		System.out.println("Number of seconds: " + numberOfSeconds);
		
	}	
	
}
