package Assignment_1;

public class Q24_testdriver {
	public static void main(String[] args) {

		Q24_NotifyAll obj1 = new Q24_NotifyAll();

		Thread t1 = new Thread(() -> obj1.printNumbers(1), "T1");
		Thread t2 = new Thread(() -> obj1.printNumbers(2), "T2");
		Thread t3 = new Thread(() -> obj1.printNumbers(3), "T3");

		t1.start();
		t2.start();
		t3.start();

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}

		synchronized (obj1) {
			obj1.notifyAll(); // wakes all waiting threads
		}
	}
}
