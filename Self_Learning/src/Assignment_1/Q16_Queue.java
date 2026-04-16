package Assignment_1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q16_Queue {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Queue<Integer> s = new LinkedList<>();

		System.out.println("How many element you have to Add: ");
		int n = sc.nextInt();
		System.out.println("Enter the elements....");
		for (int i = 0; i < n; i++) {
			int p = sc.nextInt();
			s.add(p);
		}

		System.out.println(s);

		System.out.println("Enter the element for Remove: ");
		s.remove(sc.nextInt());
		System.out.println(s);

		System.out.println("Front Elemnet: " + s.peek());

	}

}
