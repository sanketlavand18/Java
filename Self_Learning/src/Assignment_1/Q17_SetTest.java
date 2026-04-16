package Assignment_1;

import java.util.HashSet;
import java.util.Set;

public class Q17_SetTest {

	public static void main(String[] args) {
		Set<Q17_Set> list = new HashSet<>();

		list.add(new Q17_Set(1, "Raja"));
		list.add(new Q17_Set(2, "King"));
		list.add(new Q17_Set(3, "Gabbar"));
		list.add(new Q17_Set(2, "Cool"));
		list.add(new Q17_Set(5, "GoD"));
		list.add(new Q17_Set(5, "GoD"));

		for (Q17_Set e : list) {
			System.out.println("Id:" + e.id + "  Name :" + e.Name);
		}
	}
}
