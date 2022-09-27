package core.java;

import java.util.Scanner;

// Arithmetic Operator Program :
public class ArithmeticOperator {

//	Main method:
	public static void main(String[] args) {
//	Creating Scanner objects to take input from user.
		Scanner sc = new Scanner(System.in);
//	getting input value from user:
		System.out.println("Enter the first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number : ");
		int num2 = sc.nextInt();
//		Writing Operation:
		int add, sub, mul, div, mod;
		add = num1 + num2;
		sub = num1 - num2;
		mul = num1 * num2;
		div = num1 / num2;
		mod = num1 % num2;
//		Getting Result:
		System.out.println("Print the result of Addition: " + add);
		System.out.println("Print the result of Subtraction: " + sub);
		System.out.println("Print the result of Multiplication: " + mul);
		System.out.println("Print the result of Divison: " + div);
		System.out.println("Print the result of Modulus: " + mod);

	}
}
