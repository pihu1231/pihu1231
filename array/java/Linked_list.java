package array.java;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_list {
	public static void main(String[] args) {
		LinkedList<Integer> obj = new LinkedList<Integer>();
		obj.add(4);
		obj.add(5);
		obj.add(3);
		obj.add(8);
		obj.add(9);
//		System.out.println(obj);
		Iterator<Integer> a = obj.iterator();
		while (a.hasNext()) {
			System.out.println(a.next());
		}
	}
}