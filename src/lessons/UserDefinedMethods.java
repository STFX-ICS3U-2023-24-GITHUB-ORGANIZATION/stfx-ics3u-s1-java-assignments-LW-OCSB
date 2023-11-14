package lessons;

public class UserDefinedMethods {

	public static void main(String[] args) {
		
		System.out.println(addThreeInts(2, 5, 7));
		System.out.println(addFourDoubles(1.1, 2.2, 3.3, 4.4));		
		System.out.println(combineTwoStrings("fodsgfdsfgo ", "baadssdr"));
		printHelloWorld();
	}
	
	
	// DESCRIPTION - Returns the sum of three integers.
	// PARAMETERS - int x, int y, int z
	// RETURN TYPE - int
	public static int addThreeInts(int x, int y, int z)  {
		
		return (x + y + z);
	}
	
	
	// DESCRIPTION - Returns the sum of four doubles.
	// PARAMETERS - double d1, double d2, double d3, double d4
	// RETURN TYPE - double
	public static double addFourDoubles(double d1, double d2, double d3, double d4)  {
		
		return (d1 + d2 + d3 + d4);
	}
	
	
	// DESCRIPTION - Concatenates two Strings.
	// PARAMETERS - String s1, String s2
	// RETURN TYPE - String
	public static String combineTwoStrings(String s1, String s2)  {
		
		return (s1 + s2);
	}
	
	
	// DESCRIPTION - Prints "Hello World!" to console.
	// PARAMETERS - none
	// RETURN TYPE - void
	public static void printHelloWorld()  {
		
		System.out.println("Hello World!");
	}
	
}

