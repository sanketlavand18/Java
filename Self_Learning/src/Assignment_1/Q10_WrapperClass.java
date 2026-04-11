package Assignment_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q10_WrapperClass {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		// 1.adding element
		al.add(13);
		al.add(23);
		al.add(3);
		al.add(26);
		al.add(8);
		al.add(56);

		System.out.println("After adding :" + al);

		// 2. removing element
		System.out.println("enter ele for removing :" + al);
		int p = sc.nextInt();
		al.remove(Integer.valueOf(p));
		System.out.println("After removing :" + al);

		// 3/Searching element
		System.out.println(" enter searching element :");
		int n = sc.nextInt();
		if (al.contains(n)) {
			System.out.println("Element is present...");
		} else {
			System.out.println("element is not found..");
		}

		// 4 . iterarting Element

		System.out.println("Iterating the element:");
		for (Integer x : al) {
			System.out.println(x);
		}

		// 5.sorting the element
		System.out.println("sorting the element:");
		Collections.sort(al);
		System.out.println("Ascending order list: " + al);

		Collections.sort(al, Collections.reverseOrder());
		System.out.println("Decending order list :" + al);

		sc.close();
	}

}
