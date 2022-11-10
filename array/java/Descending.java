package array.java;

import java.util.Arrays;
import java.util.Scanner;

// WAP to print descending order of string array:
public class Descending {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String :");
		String str = sc.next();
//		Declaration of array:
		char arr[] = str.toCharArray();
//		Sort the array by built in method:
		Arrays.sort(arr);
		System.out.println("Print the descending order of string:");
//		Print the array using for loop
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i] + "");
		}
		sc.close();
	}

}
