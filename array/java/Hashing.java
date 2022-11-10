package array.java;

import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("Akesh");
		hs.add("Akariti");
		hs.add("Akhil");
		hs.add("Anju");
		hs.add("Anju");
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}
	}
}
