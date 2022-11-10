package exception.java;

public class ThreadPriortiy extends Thread {
	public void run() {
		System.out.println("Running Priority:" + Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPriortiy tp = new ThreadPriortiy();
		ThreadPriortiy tp1 = new ThreadPriortiy();
		tp.setPriority(Thread.MIN_PRIORITY);
		tp1.setPriority(Thread.MAX_PRIORITY);

		tp.start();
		tp1.start();
	}

}
