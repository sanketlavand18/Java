package Assignment_1;

public class Q20_ThreadTest {

	public static void main(String[] args) {
		Q20_MultiThreading t1 = new Q20_MultiThreading("Rohit", 99);
		Q20_MultiThreading t2 = new Q20_MultiThreading("Virat", 68);
		Q20_MultiThreading t3 = new Q20_MultiThreading("MSD", 78);
		Q20_MultiThreading t4 = new Q20_MultiThreading("Rishabh", 78);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
