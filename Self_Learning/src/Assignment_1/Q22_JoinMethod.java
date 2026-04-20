package Assignment_1;

public class Q22_JoinMethod extends Thread {

	public void run() {
		for (int i = 1; i <= 3; i++) {
			System.out.println("Thread: " + i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Q22_JoinMethod t1 = new Q22_JoinMethod();
		Q22_JoinMethod t2 = new Q22_JoinMethod();

		t1.start();
		t1.join();

		t2.start();

	}

}
