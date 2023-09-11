package lessons;

public class CombiningConditions_P3 {

	public static void main(String[] args) {

		int mark = 42;
		
		if (   (mark >= 0)    &&    (mark <= 100)   )  {
			
			System.out.println("You have a valid mark.");
		}
		
		else  {
			
			System.out.println("You DO NOT have a valid mark.");
		}
		
		
		if ( (mark >= 0) ||  (mark > 100) )  {
			
			System.out.println("You received a mark.");
		}
		
		
	}

}
