package exception.java;

import java.util.ArrayList;

// WAP to replace the second element of a Array list with the specified element :
public class Program4 {
	public static void main(String[] args) {
//		Create an ArrayList with String Class objects :
		ArrayList<String> color = new ArrayList<String>();
// Add method:
		color.add("Red");
		color.add("Green");

		System.out.println("Original array list: " + color);
		String new_color = "White";
//		Set method:
		color.set(1, new_color);
// Size method:
		int num = color.size();
		System.out.println("Replace second element with 'White'.");
//		Traverse with for loop:
		for (int i = 0; i < num; i++)
			System.out.println(color.get(i));
	}
}
