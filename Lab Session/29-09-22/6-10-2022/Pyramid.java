package core.java;

import java.util.Scanner;

// WAP to print the reverse Pyramid:
public class Pyramid {
	public static void main(String[] args) {
// Create an object of Scanner class:
		Scanner sc = new Scanner(System.in);
//		Take the input from user:
		System.out.println("Enter the input size of pyramid:");
		int number = sc.nextInt();
		int i, j;
//	    Logic of loop:
//		Run an inner loop from 1 to ‘i-1’
//	    Run another inner loop from 1 to rows * 2 – (i × 2 – 1) 

		// Outer loop handle the number of rows
		for (i = number; i >= 1; i--) {

			// Inner loop print space
			for (j = i; j < number; j++) {
				System.out.print(" ");
			}

			// Inner loop print star
			for (j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}

			// Ending line after each row
			System.out.println("");
		}
	}
}