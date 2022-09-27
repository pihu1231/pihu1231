package core.java;
// Arithmetic Operator to Perform three input

import java.util.Scanner;


public class Arithmetic {

//	Main method:
	public static void main(String[] args) {
//	Creating Scanner objects to take input from user.
		Scanner sc = new Scanner(System.in);
//	getting input value from user:
		System.out.println("Enter the first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number : ");
		int num2 = sc.nextInt();
		System.out.println("enter the third number: ");
		int num3 = sc.nextInt();
//		Writing Operation:
		int add, sub, mul, div, mod;
		add = num1 + num2 - num3;
		sub = num1 - num2 + num3;
		mul = num1 * num2 -num1;
		div = num1 / num2+ num2;
		mod = num1 % num2 *num2;
//		Getting Result:
		System.out.println("Print the result of Addition(num1+num2-num3): " + add);
		System.out.println("Print the result of Subtraction(num1-num2+num3): " + sub);
		System.out.println("Print the result of Multiplication(num1*num2-num1): " + mul);
		System.out.println("Print the result of Divison(num1/num2+num2): " + div);
		System.out.println("Print the result of Modulus(num1%num2*num2): " + mod);

	}
}
