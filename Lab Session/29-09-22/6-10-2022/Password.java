package core.java;

import java.util.Scanner;

// WAP to check the password:
public class Password {
	public static void main(String[] args) {
//		GIVEN password:
		String p = "Priya870!@";
//		Create an object of scanner class:
		Scanner sc = new Scanner(System.in);
//		take the input from user 
		System.out.println("Enter the password:");
		String p2 = sc.next();
// use if else condition to check the statement
//		Use (comapreTo) function to compare the two strings:
		if (p.compareTo(p2) == 0) {
			System.out.println("Your password is right.");
		} else {
			System.out.println(" Oops! you entered the Wrong password.");
		}
		sc.close();
	}

}
