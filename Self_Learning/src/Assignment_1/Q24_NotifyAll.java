package Assignment_1;

public class Q24_NotifyAll {

	synchronized void printNumbers(int n) {
		System.out.println(Thread.currentThread().getName() + " printing: " + n);

		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + " resumed");
	}
}
