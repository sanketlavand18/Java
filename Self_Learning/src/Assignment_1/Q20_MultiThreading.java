package Assignment_1;

public class Q20_MultiThreading extends Thread {

	String name;
	int marks;

	Q20_MultiThreading(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}

	public void run() {
		System.out.println("Thread: " + Thread.currentThread().getName());
		System.out.println("Student: " + name + "  Marks: " + marks);

	}

}