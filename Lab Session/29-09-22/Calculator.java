package core.java;

import java.util.Scanner;

// Create a Calculator program:
public class Calculator {

	public static void main(String[] args) {
//		Create an object of Scanner class:
		Scanner sc = new Scanner(System.in);
//		Take the input from user:
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
//		A statement used to choose the number:
		System.out.println("Choose any one number in given brackets to perform your operation : (1, 2, 3, 4):");
//		Print the information of operation:
		System.out.println("This is the value of operators: (1 = +, 2 = -, 3 = *,  4 = /)");
//		Print the choice of user:
		System.out.println("Enter your choice: ");
		int c = sc.nextInt();
//		Use  else-if conditional statement to check our logic:
		if (c == 1) {
			int add = a + b;
			System.out.println(" Add the number :" + add);
		} else if (c == 2) {
			int sub = a - b;
			System.out.println(" Sub the number : " + sub);
		} else if (c == 3) {
			int mul = a * b;
			System.out.println("Multiply the number: " + mul);
		} else if (c == 4) {
			int div = b / a;
			System.out.println(" divide the number: " + div);
		} else {
			System.out.println("You choose wrong number: ");
		}
	}
}