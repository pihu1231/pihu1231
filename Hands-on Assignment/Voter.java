package core.java;

import java.util.Scanner;

// WAP to check whether user is eligible to vote or not:
public class Voter {

	public static void main(String[] args) {
//		Create an object of Scanner class:
		Scanner sc = new Scanner(System.in);
//		take the input from user:
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		System.out.println("Age " + age);
//		check the condition of age:
		if (age == 18) {
			System.out.println("Congrats! You are eligible to vote..");

		} else if (age < 18) {
			System.out.println("OOPS .. You are not eligible to vote..");
		} else {
			System.out.println("Wooh! You are already eligible to vote..");
		}
		sc.close();
	}

}
