package lessons;
import java.util.Scanner;

public class TimeProblem {

	public static void main(String[] args) {
		
		// variables
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int hours = 0;
		int secondsRemaining = 0;
		int minutes = 0;
		int seconds = 0;
		final int SECONDS_IN_HOUR = 3600;
		final int SECONDS_IN_MINUTE = 60;
		
		// get seconds from user
		System.out.println("Enter number of seconds: ");
		
		try  {
			input = sc.nextInt();
		}
		
		catch(Exception e)  {
			e.printStackTrace();
		}
		
		// calculate number of hours
		hours = input / SECONDS_IN_HOUR;
		
		// calculate seconds remaining
		secondsRemaining = input % SECONDS_IN_HOUR;
		
		// calculate minutes
		minutes = secondsRemaining / SECONDS_IN_MINUTE;
		
		// calculate seconds
		seconds = secondsRemaining % SECONDS_IN_MINUTE;
		
		
		// output
		System.out.println("Seconds entered: " + input);
		System.out.println("HOURS: " + hours);
		System.out.println("SECONDS REMAINING AFTER HOURS CALCULATED: " + secondsRemaining);
		System.out.println("MINUTES: " + minutes);
		System.out.println("SECONDS: " + seconds);
	}

}



/*

DETAILED PSEUDO CODE (no human judgement)

Get number of seconds from user.

Calculate number of hours.
- total number of seconds / 3600 (or 60 x 60)

Calculate number of seconds remaining:
- total number of seconds % 3600

Calculate number of minutes.
- number of seconds remaining / 60

Calculate number of seconds.
- number of seconds remaining % 60

Display hours, minutes and seconds.
*/