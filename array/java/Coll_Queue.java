package array.java;

import java.util.LinkedList;
import java.util.Queue;

public class Coll_Queue {

	public static void main(String[] args) {
		Queue<Integer> obj = new LinkedList<Integer>();
		obj.add(45);
		obj.offer(34);
//		elements() : return the head element of the queue through exception if the queue is empty
// Peek() : return the head value of the queue and return null if it is empty,
//		Create an in variable data type:
		int s = obj.peek();
		System.out.println(" Access the peek element" + s);
// remove() : the head of the queue and throw exception if the queue is empty.
//		poll() : return null if the queue is empty.
		int r = obj.poll();
		System.out.println("Removed element:" + r);
		System.out.println("updated queue: " + obj);
	}

}
