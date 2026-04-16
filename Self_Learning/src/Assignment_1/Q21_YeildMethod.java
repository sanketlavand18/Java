package Assignment_1;

public class Q21_YeildMethod extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " - " + i);
			Thread.yield(); // give chance to other threads
		}
	}

	public static void main(String[] args) {
		Q21_YeildMethod t1 = new Q21_YeildMethod();
		Q21_YeildMethod t2 = new Q21_YeildMethod();

		t1.start();
		t2.start();
	}
}
