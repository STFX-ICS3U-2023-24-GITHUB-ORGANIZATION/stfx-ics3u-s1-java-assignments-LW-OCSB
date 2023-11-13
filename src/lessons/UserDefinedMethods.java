package lessons;

public class UserDefinedMethods {

	public static void main(String[] args) {
		
		System.out.println(addThreeInts(1, 2, 3));
		System.out.println(addFourDoubles(1.1, 2.2, 3.3, 4.4));
		System.out.println(combineTwoStrings("foo ", "bar"));
		printHelloWorld();
	}
	
	// DESCRIPTION - Adds 3 integers.
	// PARAMETERS - int x, int y, int z
	// RETURN TYPE - int
	public static int addThreeInts(int x, int y, int z) {
		
		return ( x + y + z );
	}
	
	// DESCRIPTION - Returns sum of four doubles.
	// PARAMETERS - double d1, double d2, double d3, double d4
	// RETURN TYPE - double
	public static double addFourDoubles(double d1, double d2, double d3, double d4) {
			
		return (d1 + d2 + d3 + d4);
	}
	
	// DESCRIPTION - Concatenates two Strings.
	// PARAMETERS - String s1, String s2
	// RETURN TYPE - String
	public static String combineTwoStrings(String s1, String s2) {
			
		return (s1 + s2);
	}
	

	// DESCRIPTION - Displays "Hello World!" to console
	// PARAMETERS - none
	// RETURN TYPE - void
	public static void printHelloWorld()  {
		
		System.out.println("Hello World!");
	}
	
}
