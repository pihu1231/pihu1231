package core.java;

import java.util.Scanner;

public class UserArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int a = sc.nextInt();
//		Declaring Array:
		int arr[] = new int[a];
		System.out.println("Enter the elements:");
//		traversing the array to enter the elements:
		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}
//		Initialize sum:
		int sum = 0;
//		traversing the array to find the sum:
		for (int i = 0; i < a; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum of all elemnts:" + sum);
		sc.close();
	}

}
