package Assignment_1;

import java.io.*;
import java.util.Scanner;

public class Q12_Test {

	public static void main(String[] args) {

		Q12_UserDefinedException obj = new Q12_UserDefinedException();

		Scanner sc = new Scanner(System.in);
		System.out.println("enter age =");
		int age = sc.nextInt();

		// Unchecked Exception
		
		System.out.println("Unchecked Exception ..........");
		try {
			obj.ageUnchecked(age);
		} catch (UserDefinedException e) {
			System.out.println(e.getMessage());
		}

		
		System.out.println("checked Exception ...............");
		try {
			obj.readFile("text.txt");
		} catch (UserDefinedCheckedException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
