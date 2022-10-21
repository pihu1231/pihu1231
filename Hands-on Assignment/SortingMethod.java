package array.java;

import java.util.Arrays;
import java.util.Scanner;

public class SortingMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int a = sc.nextInt();
//	Declaration of array:
		int a1[] = new int[a];
		System.out.println("Enter the elements of array:");
//	Traverse the loop to take input from user:
		for (int i = 0; i < a1.length; i++) {
			a1[i] = sc.nextInt();

		}
		Arrays.sort(a1);
		System.out.println(" Sorted array is:");
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}
		sc.close();

	}

}
