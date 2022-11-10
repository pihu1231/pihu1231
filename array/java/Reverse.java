package array.java;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the size of an array:");
		int a = sc.nextInt();
//		Declaration of array:
		int a1[] = new int[a];
		System.out.println("Enter the elements of array:");
//		Traverse the loop to take input from user:
		for (int i = 0; i < a1.length; i++) {
			a1[i] = sc.nextInt();

		}

		System.out.println(" Reverse array is:");
		for (int j = a; j > 0; j--) {
			System.out.println(a1[j - 1]);
		}
		sc.close();

	}

}
