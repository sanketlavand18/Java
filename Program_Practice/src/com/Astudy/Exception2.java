package com.Astudy;

public class Exception2 {

	public static void main(String[] args) {

		//multiple exception
		try {
			int arr[] = { 10, 20, 0, 30, 40 };

			//arr[10] = 50;

			int c = arr[0] / arr[2];
			System.out.println(c);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index error");
		} catch (ArithmeticException e) {
			System.out.println("Divide by zero error");
		} catch (Exception e) {
			System.out.println("General exception");
		}
	}
}
