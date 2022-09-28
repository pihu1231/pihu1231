package core.java;

// import Scanner class package to take input from system:
import java.util.Scanner;

public class LogicalOperator {
// Main method:
	public static void main(String[] args) {
//		Create  a object of scanner class to take input from system(Keyboard):
		Scanner sc = new Scanner(System.in);
//		Taking input from user:
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		System.out.println("Enter the third number: ");
		int c = sc.nextInt();
//		Using Logical(And) operator to verify two constraints:
		System.out.println("Perform and operation: ");
		if ((a < b) && (a == c)) {
			int sum = a + b + c;
			System.out.println("The sum is: \n" + sum);
		} else {
			System.out.println("False condition.");
		}
//Using Logical(Or) operator to verify two constraints:
		System.out.println("Perform or operation: ");
		if ((a < b) || (a == c)) {
			int sum = a + b + c;
			System.out.println("The sum is: \n" + sum);
		} else {
			System.out.println("False condition.");
		}
//		Performing not operator:
		System.out.println("perform not operation:");
		System.out.println("!(a<b)= " + !(a < b));
		System.out.println("!(a>b) = " + !(a > b));
		sc.close();
	}

}
