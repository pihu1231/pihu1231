package core.java;

import java.util.Scanner;

//WAP to demonstrate switch case;
public class Switch {

	public static void main(String[] args) {
//		Create an object of scanner class:
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting letter name(A-C):");
//		Take input from user:
		String str = sc.next();
//		Use switch case statement to print the name of students:
		switch (str) {
		case "A":
			str = "Amrita";

			break;
		case "B":
			str = "Beauty";

			break;
		case "C":
			str = "Charu";

			break;

		default:
			System.out.println("Invalid character");
		}
//		Print the string:
		System.out.println(str);
		sc.close();
	}

}
