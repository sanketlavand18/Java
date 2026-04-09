package com.Demo.Assignment1.friend;

import java.util.Scanner;

public class FriendTest {

	public static void main(String[] args) {
		int choice;
		int n = 2;

		Scanner sc = new Scanner(System.in);

		friend[] s = new friend[n];
		for (int i = 0; i < s.length; i++) {
			int id = sc.nextInt();
			String name = sc.next();
			String lastname = sc.next();
			int hobbie = sc.nextInt();
			int mobno = sc.nextInt();
			String email = sc.next();
			String bdate = sc.next();
			String address = sc.next();

			s[i] = new friend(id, name, lastname, hobbie, mobno, email, bdate, address);

		}

		do {
			System.out.println(
					"1) Display all Elemnet \n 2)Search by id \n 3) search by name \n 4) Display all friend with a particular hobby \n  5)Exit \n");

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
				for (friend st : s) {
					if (st.stuid == sid) {
						st.display();
					}
				}
				break;
			}
			case 3: {

				System.out.println("enter name");
				String sn = sc.next();
				for (friend st : s) {
					if (sn.equalsIgnoreCase(st.name)) {
						st.display();
					}
				}
				break;

			}
			case 4: {
				System.out.println("Enter a hobbie:");
				String sn = sc.next();
//					for (Student st : s) {
//						if (st. == sn) {
//							double gpa = st.calculateGPA();
//							System.out.println("GPA: " + gpa);
//						}
//					}
//					break;

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
