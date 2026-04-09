package com.Demo.Assignment1;

import java.util.Scanner;

public class StudentQ2Test {

	public static void main(String[] args) {

		int n;
		System.out.println("enter the student number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		StudentQ2[] s = new StudentQ2[n];
		for (int i = 0; i < n; i++) {
			s[i] = new StudentQ2();
			s[i].set();
		}
		for (int i = 0; i < s.length; i++) {

			s[i].display();
		}

	}

}
