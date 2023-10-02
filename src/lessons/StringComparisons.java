package lessons;

public class StringComparisons {

	public static void main(String[] args) {

		
		String string1 = "foo";
		String string2 = "bar";
		String string3 = "foo";

		// can't use == to compare strings
		
		if (string1.equals(string2))  {
			System.out.println("same 1");
		}
		
		if (string1.equals(string3))  {
			System.out.println("same 2");
		}
		
		

	}

}
