package com.learner;

import java.util.Scanner;
// WAP  to find max and Min Value in an array:
public class MaxMin {
//    Method of finding maximum:
    public int maximum(int[] num){
        int max =0;
        for (int j : num) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
//   method of finding minimum:
    public int minimum(int[] num){
        int min =num[0];
        for (int j : num) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
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
//        Object of MinMax class:
        MaxMin m = new MaxMin();
        System.out.println(" Max value of array:"+m.maximum(arr));
        System.out.println("Min value of array:"+m.minimum(arr));
    }
}
