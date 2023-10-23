package lessons;

public class NestedForLoops {

	public static void main(String[] args) {

		// outer loop
		for (int i=0; i<3; i++)  {
			
			System.out.println("Outer Loop Number: " + (i+1));
			
			// inner loop
			for (int j=0; j<5; j++)  {
				System.out.println("Inner Loop Number: " + (j+1));
			}
			
			
		}
		
	}

}
