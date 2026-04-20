package Assignment_1;

public class Q25_ShareThread {
	static ThreadLocal<String> studentName = new ThreadLocal<>();

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {
			studentName.set("Gabbar");
			System.out.println("Thread 1: " + studentName.get());
		});

		Thread t2 = new Thread(() -> {
			studentName.set("Hitman");
			System.out.println("Thread 2: " + studentName.get());
		});

		t1.start();
		t2.start();
	}
}
