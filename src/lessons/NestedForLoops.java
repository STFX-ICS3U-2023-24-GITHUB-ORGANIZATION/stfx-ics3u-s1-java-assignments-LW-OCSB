package lessons;

public class NestedForLoops {

	public static void main(String[] args) {
		
		// outer loop
		for (int i=0; i<3; i++)  {
			
			System.out.println( "Outer loop number: " + (i+1));
			
			// inner loop
			for (int j=0; j<4; j++)  {
				System.out.println( "Inner loop number: " + (j+1));
			}
			
		}
		
	}

}
