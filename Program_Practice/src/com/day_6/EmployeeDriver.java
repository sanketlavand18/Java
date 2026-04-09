package com.day_6;

public class EmployeeDriver {

	public static void main(String[] args) {

		Employee e;
		e = new SalaryEmp(12, "rohan", "123456789", "enginear", "elect", 12123, 12);
		System.out.println(e);

		e = new Contract(13, "mnbyv", "5251545", "vgh", "vtyy", 12, 100);

		e.toString();

		System.out.println(e);

	}

}
