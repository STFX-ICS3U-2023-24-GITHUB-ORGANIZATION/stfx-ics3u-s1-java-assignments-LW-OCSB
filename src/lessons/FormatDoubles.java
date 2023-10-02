package lessons;

import java.text.DecimalFormat;

public class FormatDoubles {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("0.00");
		double num = 12.1;
		num = Double.parseDouble(df.format(num));
		System.out.println(num); 
	}

}
