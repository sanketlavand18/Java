package Assignment_1;

public class Q24_Wait {

	int data;
	boolean data1 = false;

	synchronized void produce(int value) {
		while (data1) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		data = value;
		System.out.println("Produced: " + data);
		data1 = true;
		notify();
	}

	synchronized void consume() {
		while (!data1) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Consumed: " + data);
		data1 = false;
		notify();
	}
}
