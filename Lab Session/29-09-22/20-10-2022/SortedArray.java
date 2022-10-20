package com.learner;

import java.util.Scanner;
import java.util.Arrays;
// WAP to print the sorted string and numeric array :
public class SortedArray {

    public static void main(String[] args) {
//        Create an object of scanner class
        Scanner sc = new Scanner(System.in);
//        Take Input from user to enter your String:
        System.out.println(" Enter your String name: ");
        String str = sc.next();
        System.out.println("Enter the size of numeric array:");
        int size = sc.nextInt();
//        Initialization of array:
        int [] num = new int[size];
        System.out.println("Enter the Elements of an array: ");
//        Traverse the array to take input from user:
        for (int i = 0; i < size ; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("Print the sorted Array:");
//        Traverse the array to print the sorted array:
        for (int j : num) {
            Arrays.sort(num);
            System.out.println(j);
        }

//        convert the string into a char array:
        char[] arr = str.toCharArray();
//        Using Array.sort() method to sort our String in increasing method:
        Arrays.sort(arr);
//        making the string from array:
        str = new String(arr);

        System.out.println("Print the Sorted string: " +str);



    }
}
