package lessons;

public class RandomNumber {

	public static void main(String[] args) {

		
		// generate random number between 0-n
		// use a variable "n"
		int n = 3;
		System.out.println((int)((Math.random() * (n+1))));

		
		// generate random number between 0-k
		// use a variable "k"
		int k = 3;
		System.out.println((int)((Math.random() * (k) + 1)));
		
	}

}
