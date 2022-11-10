package array.java;

import java.util.Stack;

public class Coll_Stack {

	public static void main(String[] args) {
		Stack<Integer> b = new Stack<Integer>();
		b.push(45);
		b.push(76);
		b.push(95);
		System.out.println(b);
		b.pop();
		System.out.println(" Stack after top: " + b);
	}

}
