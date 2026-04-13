package com.Astudy;

public class ExceptionHandling {

	public static void main(String[] args) {

		int n = 10;
		int m = 0;

		try {
			int c = n / m;
			System.out.println("output: " + c);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		//finaly block
		finally {
			System.out.println("I from finally block which execute all time");
		}

	}

}
