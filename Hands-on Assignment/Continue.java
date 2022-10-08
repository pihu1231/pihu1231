package core.java;

import java.util.Scanner;

// WAP to demonstrate while loop continues until the entered number is positive:
public class Continue {

	public static void main(String[] args) {
		int sum = 0;
//		Create an object of Scanner class:
		Scanner sc = new Scanner(System.in);
//		Take the input from user:
		System.out.println(" Enter your number:");
		int x = sc.nextInt();
//		while loop continue until entered no is +ve :
		while (x >= 0) {
//			add only positive numbers: 
			sum += x;
			System.out.println("Enter your number");
			x = sc.nextInt();
			System.out.println("Sum = " + sum);
		}
		sc.close();
	}

}
