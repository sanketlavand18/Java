package Assignment_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q19_Streams {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student("Hitman", 75), 
											   new Student("Gabbar", 50),
											   new Student("King", 90), 
											   new Student("Spidy", 60));

		// 🔹 1. map() : Convert marks to grades
		List<String> grades = students.stream().map(s -> {
			if (s.marks >= 80)
				return s.name + " : A";
			else if (s.marks >= 60)
				return s.name + " : B";
			else
				return s.name + " : C";
		}).collect(Collectors.toList());

		System.out.println("Grades:");
		grades.forEach(System.out::println);

		// 🔹 2. reduce() : Calculate total marks
		int totalMarks = students.stream().map(s -> s.marks).reduce(0, (a, b) -> a + b);

		System.out.println("Total Marks: " + totalMarks);

		// 🔹 3. count() :  Count students
		long count = students.stream().count();

		System.out.println("Total Students: " + count);

		// 🔹 4. sorted() : Rank students (by marks descending)

		List<Student> ranked = students.stream().sorted((s1, s2) -> s2.marks - s1.marks).collect(Collectors.toList());

		System.out.println("Ranking:");
		ranked.forEach(System.out::println);

	}

}
