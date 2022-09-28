package core.java;

import java.util.Scanner;

class Unary {

	public static void main(String[] args) {
//		Create object of Scanner class:
		Scanner sc = new Scanner(System.in);
//		Taking input from user:
		System.out.println("Enter the first number: ");
		int m = sc.nextInt();
//		Perform unary operation:
		m = -m;
		System.out.println("Prirnt the result of : " + m);
//		Perform <pre>-increment operator:
		++m;
		System.out.println(" Print the result of pre-increment: " + m);
		--m;
		System.out.println("Print the result of pre-decrement: " + m);
// Perform post-increment & decrement :
		m++;
		System.out.println("Print the result of post-increment: " + m);
		m--;
		System.out.println("Print the result of post-Decrement:" + m);
		sc.close();
	}

}
