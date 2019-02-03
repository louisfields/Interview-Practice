
// Java code to compute 
// average of two numbers 
// This code is contributed by ajit
// https://www.geeksforgeeks.org/compute-average-two-numbers-without-overflow/

import java.io.*;

public class GFG {

	// Function to compute
	// average of two numbers
	static int compute_average(int a, int b) {
		double div1 = (a/2);
		double div2 = (b/2);
		double mod1 = (a % 2);
		double mod2 =(b % 2);
		// The act og storing it in a variable is not space efficient.
		double fin = div1 + div2 + ((mod1 + mod2) / 2);
		int convert = (int) fin;
		return convert;
		// This implementation works better:
//		return (a / 2) + (b / 2) + (((a % 2) + (b % 2)) / 2);
	}

	// Driver code
	public static void main(String[] args) {

		// Assigning maximum
		// integer value
		int a = Integer.MAX_VALUE;
		int b = Integer.MAX_VALUE;

		// Average of two equal
		// numbers is the same number
		System.out.println("Actual average : " + Integer.MAX_VALUE);

		// Function to get the
		// average of 2 numbers
		System.out.print("Computed average : ");
		System.out.println(compute_average(a, b));
	}
}

