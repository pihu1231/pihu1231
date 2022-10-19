package core.java;

import java.util.Scanner;

// WAP to print the sum of Odd numbers:
public class OddofSum {

	public static void main(String[] args) {
//		Declaration of fields:
		int Size, i, OddSum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print(" Please Enter the size of array : ");
//		Take the size of array from user:
		Size = sc.nextInt();

		int[] a = new int[Size];

		System.out.print(" Please Enter " + Size + " elements of an Array  : ");
//		 Traversing array to take the input elements:
		for (i = 0; i < Size; i++) {
			a[i] = sc.nextInt();
		}
// Traversing the array to print  the sum of odd numbers:
		for (i = 0; i < Size; i++) {
			if (a[i] % 2 != 0) {
				OddSum = OddSum + a[i];
			}
		}
		sc.close();
		System.out.println("\n The Sum of Odd Numbers in this Array = " + OddSum);

	}
}
