package lessons;

public class Casting_P3 {

	public static void main(String[] args) {

		// casting means changing one data type to another
		
		// int to String
		String myString1 = "";
		int myInteger1 = 13;	
		myString1 = Integer.toString(myInteger1);
		System.out.println(myString1);
		
		// String to int
		String myString2 = "18";
		int myInteger2;
		myInteger2 = Integer.parseInt(myString2);
		System.out.println(myInteger2);
	
		// double to String
		String myString3 = "";
		double myDouble1 = 13.3;
		myString3 = Double.toString(myDouble1);
		System.out.println(myString3);
		
		// String to double
		String myString4 = "6.8";
		double myDouble2;
		myDouble2 = Double.parseDouble(myString4);
		System.out.println(myDouble2);
		
		// int to double
		int myInteger3 = 42;
		double myDouble3;
		myDouble3 = myInteger3;  // this will automatically convert int to double
		myDouble3 = (double)myInteger3;  // explicitly converting int to double
		System.out.println(myDouble3);
		
		// double to int
		// ** this will truncate, not round!!!
		double myDouble4 = 15.9;
		int myInteger4;
		myInteger4 = (int)myDouble4;  // must explicitly convert double to int
		System.out.println(myInteger4);
		
	}

}
