package Assignment_1;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import java.util.Arrays;
import java.util.List;

public class Q9_DateConverter {

	private String date1;
	private String date2;
	LocalDate d1;
	LocalDate d2;

	// constructor
	public Q9_DateConverter(String date1, String date2) {
		this.date1 = date1;
		this.date2 = date2;
	}

	// convertion of string to local date

	public void LocaldateConverter() {
		DateTimeFormatter dtl = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		d1 = LocalDate.parse(date1, dtl);
		d2 = LocalDate.parse(date2, dtl);

		System.out.println(d1);
		System.out.println(d2);

	}

	// Check which date is before / after / equal
	public void checkDate() {
		if (d1.isAfter(d2)) {
			System.out.println("d1 is after d2");
		} else if (d1.isBefore(d2)) {
			System.out.println("d1 is before d2");
		} else {
			System.out.println("dates are same");
		}
	}

	// Find Difference Between Two Dates (Days)
	public void dateDifference() {
		long days = ChronoUnit.DAYS.between(d1, d2);

		System.out.println("diff betn two dates is: " + days);

	}

	// using lambda Expression
	public void LambdaEXp() {
		List<String> dates = Arrays.asList("10/11/2006", "02/12/2002", "30/04/2000");

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		dates.sort((a, b) -> {
			LocalDate d3 = LocalDate.parse(a, dtf);
			LocalDate d4 = LocalDate.parse(b, dtf);
			return d3.compareTo(d4);
		});

		System.out.println("sorted list");
		dates.forEach(System.out::println);
	}

}