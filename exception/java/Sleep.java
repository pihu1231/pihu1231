package exception.java;

public class Sleep extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {

				Thread.sleep(500);

			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Sleep s = new Sleep();
//		Sleep s2 = new Sleep();
		s.start();
//		s2.start();
	}
}
