package Assignment_1;

import java.util.*;

public class Q11_EmpCollectionTest {
	public static void main(String[] args) {

		List<Q11_EmpCollection> list = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the no of Student:");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.println("enter the id of Student:");
			int id = sc.nextInt();
			System.out.println("enter the name of Student:");
			String name = sc.next();
			System.out.println("enter the salary of Student:");
			Double sal = sc.nextDouble();
			System.out.println("enter the desg of Student:");
			String desg = sc.next();
			Q11_EmpCollection obj = new Q11_EmpCollection(id, name, sal, desg);
			list.add(obj);
		}

		int choice = 0;
		do {

			System.out.println("Sorting menu:");
			System.out.println("Sorting by id: 1");
			System.out.println("Sorting by name: 2");
			System.out.println("Sorting by salary: 3");
			System.out.println("Sorting by desg: 4");
			System.out.println(" exit: 5");

			choice = sc.nextInt();
			switch (choice) {
			case 1 -> {
				Collections.sort(list);
				list.forEach(System.out::println);
			}
			case 2 -> {
				Collections.sort(list, new Q11_NameComparator());
				list.forEach(System.out::println);
			}
			case 3 -> {
				Collections.sort(list, new Q11_SalComparator());
				list.forEach(System.out::println);
			}

			case 4 -> {
				Collections.sort(list, new Q11_DesgComparator());
				list.forEach(System.out::println);
			}
			case 5 -> {
				sc.close();
				System.out.println("Thanku for visitiing>>>>>>");
			}

			}
		} while (choice != 5);

	}
}
