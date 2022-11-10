package array.java;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List {

	public static void main(String[] args) {
		ArrayList<Integer> obj = new ArrayList<Integer>();
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
