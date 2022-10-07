package core.java;

import java.util.Scanner;

// WAP to print the reverse order of given input:
public class ReverseOrder {

	public static void main(String[] args) {
//		Create an object of Scanner class:
		Scanner sc = new Scanner(System.in);
//		Take the input from  user:
		System.out.println("Enter your number: ");
		int a = sc.nextInt();
		int count = a;
		System.out.println("Print the reverse order:");
		// Using do-while loop to print the reverse order:
		do {

			System.out.println(count);
			count--;
		} while (count > 0);
		sc.close();
	}

}
