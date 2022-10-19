package core.java;

import java.util.Scanner;

// WAp to display only even numbers:
public class EvenArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
// Initialize an array:
		int num[];
//		Declaration of array:
		num = new int[10];
		System.out.println("Enter the numbers:");
//		Traverse the array to take the input from user:
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println(" Even numbers are:");
		int sum = 0;
//		Traverse the array to check the even numbers:
		for (int i = 0; i < num.length; i++) {
			if (sum == num[i] % 2) {
				System.out.println(num[i]);
			}
		}
		sc.close();
	}

}
