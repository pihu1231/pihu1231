package com.learner;

import java.util.Arrays;
import java.util.Scanner;
// WAP to find 2nd largest  number in array:
public class L2_Array {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int s = scanner.nextInt();
//   Declaration of array:
        int []arr = new int[s];
        System.out.println("Enter the elements of array:");
//        Traverse the array to take input:
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
//        Traverse the array to find the second large number:
        for (int i = 0; i < arr.length; i++) {
//            Sorted array:
            Arrays.sort(arr);
        }
//Print the second large number:
        System.out.println(" Print the Second largest number: "+arr[arr.length-2]);
    }
}


