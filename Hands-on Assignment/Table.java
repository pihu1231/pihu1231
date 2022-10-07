package core.java;

import java.util.Scanner;

// WAP to print the multiplication table:
public class Table {

	public static void main(String[] args) {
//		Create an object of scanner class:
		Scanner sc = new Scanner(System.in);
//		Take the input from user:
		System.out.println("Enter your number:");
		int num = sc.nextInt();
		System.out.println("Prnt the table of " + num);
//		Using for loop to print our table:
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
		sc.close();
	}

}
