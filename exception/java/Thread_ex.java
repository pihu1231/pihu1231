package exception.java;

public class Thread_ex extends Thread {
	public static int amount = 0;

	public static void main(String[] args) {
		Thread_ex te = new Thread_ex();
		te.start();
//		Wait for thread to finish:
		while (te.isAlive()) {
			System.out.println("Thread is a still alive:");
		}
//		Update amount and print the value:
		System.out.println("value :" + amount);
		amount++;
		System.out.println("Value:" + amount);

	}

	public void run() {
		amount++;
	}

}
