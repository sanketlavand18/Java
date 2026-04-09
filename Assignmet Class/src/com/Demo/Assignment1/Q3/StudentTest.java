package com.Demo.Assignment1.Q3;

import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		int choice;
		int n = 2;

		Scanner sc = new Scanner(System.in);

		Student[] s = new Student[n];
		for (int i = 0; i < s.length; i++) {
			s[i] = new Student();
			s[i].set();

		}

		do {
			System.out.println(
					"1) Display all Elemnet \n 2)Search by id \n 3) search by name \n 4)calculate Gpa \n  5)Exit \n");

			System.out.println("enter your choice");
			choice = sc.nextInt();

			switch (choice) {
			case 1: {
				for (int i = 0; i < s.length; i++) {
					s[i].display();
				}

				break;
			}
			case 2: {
				System.out.println("enter id");
				int sid = sc.nextInt();
				for (Student st : s) {
					if (st.stuid == sid) {
						st.display();
					}
				}
				break;
			}
			case 3: {

				System.out.println("enter name");
				String sn = sc.next();
				for (Student st : s) {
					if (sn.equalsIgnoreCase(st.name)) {
						st.display();
					}
				}
				break;

			}
			case 4: {
				System.out.println("Enter ID to calculate GPA:");
				int gid = sc.nextInt();
				for (Student st : s) {
					if (st.stuid == gid) {
						double gpa = st.calculateGPA();
						System.out.println("GPA: " + gpa);
					}
				}
				break;

			}
			case 5: {
				System.out.println("thanku for visiting..........");
				sc.close();
				break;
			}
			default: {
				System.out.println("enter correct number...");
			}
			}
		} while (choice != 5);

	}

}
