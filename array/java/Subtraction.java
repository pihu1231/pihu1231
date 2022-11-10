package array.java;

import java.util.Scanner;

public class Subtraction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows and cols:");
		int n = sc.nextInt(); // indicating rows
		int m = sc.nextInt(); // indicate column
		int arr[][] = new int[n][m];
		int brr[][] = new int[n][m];
		int crr[][] = new int[n][m];
		System.out.println("Ist Array elements are: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("2nd Array elements are:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				brr[i][j] = sc.nextInt();
			}
		}
		System.out.println(" Resultant  Matrix:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				crr[i][j] = arr[i][j] - brr[i][j];
			}
		}
		System.out.println("print the result of Subtraction:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(crr[i][j] + "");
			}
			System.out.print("");
		}
		sc.close();
	}
}
