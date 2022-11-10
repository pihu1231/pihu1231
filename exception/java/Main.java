package exception.java;

/* If the class extends thread class then thread can be run by creating an instance of the class
 *  By calling  start() method*/
public class Main implements Runnable {

	public static void main(String[] args) {
		Main t = new Main();
		Thread t1 = new Thread(t, "Priya");

		t1.start();
//		System.out.println(" It is the Main class:" + t.getName());
		System.out.println(" It is another class:" + t1.getName());
	}

	public void run() {
		System.out.println(" Now run the thread program:");
	}

}
