package lessons;

public class Rounding {

	public static void main(String[] args) {

		double price = 13.579;
		
		// move decimal to the right of the position you want to round to
		price = price * 100;
		
		// round 
		price = Math.round(price);
		
		// move decimal back to original position
		price = price / 100;

		System.out.println("$" + price);

	}

}
