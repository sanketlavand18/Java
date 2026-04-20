package Assignment_1;

public class Q21_SameTask {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Q21_Task1());
		Thread t2 = new Thread(new Q21_Task2());

		t1.start();
		t2.start();
	}
}
