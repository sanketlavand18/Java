package Assignment_1;

public class Q26_reflection {

	String name;
	int marks;

	private void showMarks(String name, int marks) {
		this.name = name;
		this.marks = marks;
		System.out.println(name + " scored " + marks);
	}
}