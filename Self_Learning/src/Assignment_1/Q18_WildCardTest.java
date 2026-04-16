package Assignment_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q18_WildCardTest {

	// ? extend any class
	public static void display(List<? extends Q18_Person> li) {
		for (Q18_Person e : li) {
			System.out.println("name  :" + e.name);
		}
	}

	// ? extend super class
	public static void write(List<? super Q18_Student> ar) {
		ar.add(new Q18_Student("rahul", 45));
	}

	// ? Geniric
	public static void printlist(List<?> sp) {
		for (Object obj : sp) {
			System.out.println(obj);
		}
	}

	public static void main(String[] args) {

		/// superclass
		List<Q18_Person> li = new ArrayList<>();
		li.add(new Q18_Person("Hitman"));

		// child Class
		List<Q18_Student> lii = new ArrayList<>();
		lii.add(new Q18_Student("King", 45));

		// ? extends → display (READ)
		display(li);
		display(lii);

		// ? super → show (WRITE)
		write(li);
		write(lii);

		// ? → print
		printlist(lii);

	}
}
