package core.java;

import java.util.Scanner;

//Relational Operator program:
public class Relational {
//Main Method
	public static void main(String[] args) {
//		Create Scanner class to take input from user
		Scanner sc = new Scanner(System.in);
//		Getting input value from user :
		System.out.println("Enter the first value: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second value: ");
		int num2 = sc.nextInt();
		System.out.println("Enter the third value: ");
		int num3 = sc.nextInt();
//		Perform the equal operator:
		System.out.println("Print the result of equal operator: " + (num1 == num2));
//		perform Not Equal operator:
		System.out.println("Print the result of not equal to operator: " + (num1 != num2));
//		perform the Greater than operator:
		System.out.println("Print the result of less than: " + (num1 < num2));
//		perform the Greater than operator:
		System.out.println("Print the result of greater than: " + (num1 > num2));
//		perform the Greater than or equal to operator:
		System.out.println("Print the result of greater than: " + (num3 <= num2));
//		perform the Less than or equal to operator:
		System.out.println("Print the result of greater than: " + (num1 >= num3));

	}

}

