package core.java;

import java.util.Scanner;

// WAP to demonstrate continue statement using while loop:
public class Continue {

	public static void main(String[] args) {
//		Create an object of Scanner class:
		Scanner sc = new Scanner(System.in);
//		Take the input from user:
		System.out.println(" Enter your number:");
		int x = sc.nextInt();
//		while loop:
		int i = x;
		while (i <= 50) {
			if (i == 5) {
//				using continue statement:
				i++;
				continue; // Skip the rest statement
			}
			System.out.println(i);
			i++;
		}
		sc.close();
	}

}
