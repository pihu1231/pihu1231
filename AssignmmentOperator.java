package core.java;

import java.util.Scanner;

class AssignmmentOperator {
//Main method:
	public static void main(String[] args) {
//		Create Object of Scanner class:
		Scanner sc = new Scanner(System.in);
//		 Taking input from user:
		System.out.println("Enter the first number: ");
		int x = sc.nextInt();
		System.out.println("Enter the second number: ");
		int y = sc.nextInt();
//		  Adding an assigning values:
		x += y;
		System.out.println(" Additon of x = " + x);
//		 Subtracting an assigning value :
		y -= x;
		System.out.println(" Subtraction of y = " + y);
//		 Multiply and assigning the value:
		x *= 10;
		System.out.println(" Multiply of x = " + x);
//		 Divide and assigning the value:
		y /= 2;
		System.out.println(" Dividing of y = " + y);
//		 Modulo and assigning the value:
		y %= 4;
		System.out.println(" Modulo of y = " + y);
		sc.close();
	}

}
