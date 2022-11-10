package array.java;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue_Array {

	public static void main(String[] args) {
		Deque<String> dq = new ArrayDeque<>();
		dq.add("Alomods");
		dq.add("cashews");
		dq.add("Raisins");
		dq.add("Peanut");
		dq.add("Pistachio");
		System.out.println("Elements of dq are :");
		for (String string : dq) {
//			
			System.out.println(string);
		}
		dq.pollLast();
		System.out.println(" After poll last :");
		for (String string : dq) {
			System.out.println(string);
		}
	}

}
