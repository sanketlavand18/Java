package com.Astudy;

import java.util.Scanner;

enum Gender {
	MALE, FEMALE, OTHER
}

public class EnumExample {

	public static void main(String[] args) {

		// first method
		// Gender g=g.MALE;

		// Second Method

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Gender:");

		String input = sc.next().toUpperCase();

		Gender g = Gender.valueOf(input);

		switch (g) {
		case MALE: {
			System.out.println(" you are  Male");
			break;

		}
		case FEMALE: {
			System.out.println(" you are  Fe-Male");
			break;

		}
		case OTHER: {
			System.out.println(" you are  Other");
			break;
		}
		
		}
		sc.close();
	}
}
