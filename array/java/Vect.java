package array.java;

import java.util.Vector;

public class Vect {
	public static void main(String[] args) {
		Vector<String> obj = new Vector<String>();
//		Using add method:
		obj.add("Shreya");
		obj.add("priya");
		obj.add("Aakesh");
//		Using Index number remove objects:
		obj.remove(1);
		System.out.println("Vector :" + obj);
//		Using add all method:
		Vector<Integer> o = new Vector<Integer>();
		o.add(34);
		o.add(56);
//		remove integer :
		int s = o.remove(0);
		o.clear();
		System.out.println("Removed vector: " + s);
		System.out.println("new Vector:" + o);
	}
}
