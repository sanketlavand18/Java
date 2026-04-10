package Assignment_1;

public class Q8_MyInterfaceTest {
	public static void main(String[] args) {

		int p = 10;
		int q = 20;

		Q8_MyInterface obj = (a, b) -> {

			System.out.println("I am from my interface using Lambda expression");

			int add = a + b;
			System.out.println("The Addition is :" + add);
		};
		obj.add(p, q);
	}

}
