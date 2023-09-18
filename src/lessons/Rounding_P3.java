package lessons;

public class Rounding_P3 {

	public static void main(String[] args) {
		
		// int rounding
		double price = 13.579;
		
		// move decimal 2 places to right
		price = price * 100;
		
		// round to nearest int
		price = Math.round(price);
		
		//  move decimal 2 places left
		price = price / 100;
		
		System.out.println("$" + price);
		
	}

}
