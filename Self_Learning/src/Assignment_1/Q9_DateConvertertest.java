
package Assignment_1;

import java.util.Scanner;

public class Q9_DateConvertertest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String date1;
		String date2;
		
		System.out.println("Enter the date1 (dd/MM/yyyy):");
		date1 = sc.next();
		
		System.out.println("Enter the date2 (dd/MM/yyyy):");
		date2 = sc.next();
		
		Q9_DateConverter obj = new Q9_DateConverter(date1, date2);
		obj.LocaldateConverter();
		obj.checkDate();
		obj.dateDifference();
		obj.LambdaEXp();
		
		sc.close();
	}
}
