package array.java;

import java.util.Scanner;

// WAP to print Happy Diwali in string array:
public class Diwali {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String :");
		String str = sc.next();
//		Declaration of array:
		char arr[] = str.toCharArray();
		System.out.println("Print the reverse array: ");
//		Print the array using for loop
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i] + "");
		}
		sc.close();
	}
}