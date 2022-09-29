package core.java;

// Inheritance class inherited the property of Child class:
public class Inheritance extends Child {
//	Main method:
	public static void main(String[] args) {
//		Create object of Inheritance :
		Inheritance i = new Inheritance();
//	Call the Parent & Child method:
		i.sing();
		i.dance();
		i.speak();

	}
}