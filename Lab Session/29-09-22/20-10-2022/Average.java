package com.learner;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
//              Create an object of scanner class
        Scanner sc = new Scanner(System.in);
//        Take Input from user to enter your String:
        System.out.println("Enter the size of numeric array:");
        int size = sc.nextInt();
//        Initialization of array:
        int [] num = new int[size];
        System.out.println("Enter the Elements of an array: ");
//        Traverse the array to take input from user:
        for (int i = 0; i < num.length ; i++) {
            num[i] = sc.nextInt();
        }
        int sum =0;
        for (int j : num) {
            sum = sum+j;
        }
int avg = sum/size;
        System.out.println("Print the average of given array:" +avg);
    }
}
