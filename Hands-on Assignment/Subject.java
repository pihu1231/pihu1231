package core.java;

import java.util.Scanner;

// WAP to check whether a student is passed the exam  or not:
public class Subject {

	public static void main(String[] args) {
//		Create an object of Scanner class:
		Scanner sc = new Scanner(System.in);
//		Take the input from user:
		System.out.println("Enter your name: ");
		String name = sc.next();
		System.out.println("My name is : " + name);
		System.out.println("Please Enter the marks of each subject: ");
		System.out.println("Enter the marks of Java: ");
		int Java_marks = sc.nextInt();
		System.out.println("Enter the marks of Python: ");
		int Pyth_marks = sc.nextInt();
		System.out.println("Enter the marks of Web Devlopment: ");
		int Web_marks = sc.nextInt();
		System.out.println("Enter the marks of Machine learning: ");
		int ML_marks = sc.nextInt();
		System.out.println("Enter the marks of DBMS: ");
		int Data_marks = sc.nextInt();
//	Calculate total marks:
		System.out.println("Print the total marks:");
		float total_marks = Java_marks + Pyth_marks + Web_marks + ML_marks + Data_marks;
		System.out.println(+total_marks);
		float percentage = total_marks / 500 * 100;
		System.out.println("Your percentage is:" + percentage);
//		Check the condition:
		if (percentage == 60) {
			System.out.println("You have passed the exam : " + percentage);
		} else if (percentage < 60) {
			System.out.println("You didn't passed the Exam: " + percentage);
		} else {
			System.out.println(" you are in distinction: ");
		}
		sc.close();
	}

}
