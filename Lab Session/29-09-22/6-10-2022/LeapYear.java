package core.java;

import java.util.Scanner;

// WAP for leap year to Check is it user number is leap year or not:
public class LeapYear {

	public static void main(String[] args) {
//		Create an object of Scanner class:
		Scanner sc = new Scanner(System.in);
//		Take the Input from user:
		System.out.println("Enter the year: ");
		int year = sc.nextInt();
//		Now Use if-else condition to check the leap year
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("Entered number is a leap year");
		} else {
			System.out.println("Entered number is not a leap year");
		}
	}
}