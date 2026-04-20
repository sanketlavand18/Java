package Assignment_1;

public class Q22_SleepMethods extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Q22_SleepMethods t1 = new Q22_SleepMethods();
		t1.start();
	}
}
