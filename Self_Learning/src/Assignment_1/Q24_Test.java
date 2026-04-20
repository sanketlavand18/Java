package Assignment_1;

public class Q24_Test {
	public static void main(String[] args) {

		Q24_Wait obj = new Q24_Wait();

		Thread producer = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				obj.produce(i);
			}
		});

		Thread consumer = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				obj.consume();
			}
		});

		producer.start();
		consumer.start();
		System.out.println("****************************");

	}
}
