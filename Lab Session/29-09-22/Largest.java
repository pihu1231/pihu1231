package core.java;

import java.util.Scanner;

// Create a Program to find the largest of two number:
public class Largest {
// Main method:
	public static void main(String[] args) {
//		create a object of Scanner class:
		Scanner sc = new Scanner(System.in);
//		Take the Input from user:
		System.out.println("Enter the value of x : ");
		int x = sc.nextInt();
		System.out.println("Enter the value of y : ");
		int y = sc.nextInt();
//		Perform Relational operation with if else condition:
		if (x > y) {
			System.out.println("X is the largest number: " + x);
		} else {
			System.out.println("Y is the largest number: " + y);
		}

	}

}
