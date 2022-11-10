package array.java;

import java.util.Scanner;

public class SortedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int s = sc.nextInt();
// Declaration of array:
		System.out.println("Enter the elements of array:");
		int a1[] = new int[s];
// Traverse the array to take input from user:
		for (int i = 0; i < a1.length; i++) {
			a1[i] = sc.nextInt();
		}
		int sum = a1[0];
		for (int i = 0; i < a1.length; i++) {
			if (a1[i] > i) {
				sum = a1[i];
			}
		}
		System.out.println("Min value:" + sum);
		sc.close();
	}

}
