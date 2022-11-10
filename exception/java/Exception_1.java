package exception.java;

public class Exception_1 {

	public static void main(String[] args) {
		try {
			int b = 6;
			int a = b / 0;
			System.out.println(a);
		} catch (ArithmeticException e) {
			System.out.println("This is error " + e.getMessage());

		}

	}

}
