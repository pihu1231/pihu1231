package array.java;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_hash {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lh = new LinkedHashSet<>();
		lh.add(54);
		lh.add(345);
		lh.add(42);
		lh.add(353);
// traversing elements by iterator method
		Iterator<Integer> it = lh.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}
	}

}
