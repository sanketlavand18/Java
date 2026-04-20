package Assignment_1;

import java.lang.reflect.Method;

public class Q26_reflectionTest {
	public static void main(String[] args) throws Exception {

		Q26_reflection s = new Q26_reflection();

		Method m = Q26_reflection.class.getDeclaredMethod("showMarks", String.class, int.class);

		m.setAccessible(true);

		m.invoke(s, "Sanket", 85);
	}
}