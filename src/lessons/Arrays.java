package lessons;

import java.lang.reflect.Array;

public class Arrays {

	public static void main(String[] args) {

		// Java arrays hold ELEMENTS of any single type
		// Not dynamic (can't grow or shrink after creation)
		// Uses a single identifier with indexes (0 to n-1)
		// Creating array syntax:  dataType[] arrayIdentifier = new dataType[size];
		// Example: (array of 5 integers)
		
		int[] myIntArray = new int[5];
		
		// Assigning 5 values to array
		myIntArray[0] = 7;
		myIntArray[1] = 9;
		myIntArray[2] = 11;
		myIntArray[3] = 13;
		myIntArray[4] = 15;
		
		
		// Accessing array elements
		System.out.println(myIntArray[3]);
		System.out.println(myIntArray[0] + myIntArray[4]);
		
		
		// Java Exception Error if you try to access non-existing element
		// System.out.println(myIntArray[5]);
		
		
		// Print size of array
		System.out.println(myIntArray.length);
		
		
		// Print all elements in array
		for (int i=0; i<myIntArray.length; i++)  {
			
			System.out.println(myIntArray[i]);
		}
		
		// Print sum of all elements in array
		int sum = 0;
		
		for (int i=0; i<myIntArray.length; i++)  {
			
			sum = sum + myIntArray[i];
		}
		
		System.out.println("Sum of elements in array: " + sum);
		
		
		// Create array and initialize with values immediately
		double[] myDoubleArray = {3.3, 4.3, 1.6};
		
		
		// Print contents of myDoubleArray:
		for (int i=0; i<myDoubleArray.length; i++)  {
			
			System.out.println(myDoubleArray[i]);
		}
	
	}

}
