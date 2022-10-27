package array.java;

import java.util.Scanner;

// WAP to print the array in Ascending order:
public class Sorting {

	public static void main(String[] args) {
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int s = sc.nextInt();
// Declaration of array:
		int[] arr = new int[s];
		System.out.println("Enter the elements of array:");
// Traverse the array to take input from user:
		for (int i = 0; i < s; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < s; j++) {
				if (arr[i] > arr[j]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Array print in ascending order:");
		for (int i = 0; i < s; i++) {
			System.out.println(arr[i]);
		}

		sc.close();
	}

}
