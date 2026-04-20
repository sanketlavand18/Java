package Assignment_1;

public class Q22_YeildMethod extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " - " + i);
			Thread.yield(); // give chance to other threads
		}
	}

	public static void main(String[] args) {
		Q22_YeildMethod t1 = new Q22_YeildMethod();
		Q22_YeildMethod t2 = new Q22_YeildMethod();

		t1.start();
		t2.start();
	}
}
