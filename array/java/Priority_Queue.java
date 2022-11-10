package array.java;

import java.util.PriorityQueue;

public class Priority_Queue {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(14);
		pq.add(9);
		System.out.println("Priority queue : ");
//		Iterator<Integer> iterate = pq.iterator();
//		while (iterate.hasNext()) {
//			System.out.println(iterate.next());
//			System.out.println(" ,");
//
//		}
		while (!pq.isEmpty()) {
			System.out.println(" Deque elements are : " + pq.remove());
		}

	}

}
