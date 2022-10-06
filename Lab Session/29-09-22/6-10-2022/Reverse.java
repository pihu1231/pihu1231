package core.java;

import java.util.Scanner;

// WAP to print the reverse of a number:
public class Reverse {
// static variable declaration:
	static int rev = 0;

	// Function to reverse the number
	static void reverse(int n) {

		if (n <= 0)
			return;

		int rem = n % 10; // remainder

		rev = (rev * 10) + rem;

		reverse(n / 10);
	}

	public static void main(String[] args) {
//		Create an object of Scanner class:
		Scanner sc = new Scanner(System.in);
//		Take the input from user:
		System.out.println("Enter your number: ");
		int n = sc.nextInt();
// Call the reverse function:
		reverse(n);

		System.out.print("Reversed Number is " + rev);

	}
}