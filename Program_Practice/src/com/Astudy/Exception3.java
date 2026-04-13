package com.Astudy;

public class Exception3 {

    public static void main(String[] args) {

        Exception3 obj = new Exception3();

        obj.add1();  
    }

    public void add1() {
     
    	 try {
            add2();
         } catch (ArithmeticException e) {
             System.out.println("Exception handled in add1: " + e.getMessage());
         }
        
    }

    public void add2() {
        add3();
    }

    public void add3() {
        int a = 3;
        int b = 0;

        if (b == 0) {
            // Manually throwing exception
            throw new ArithmeticException("Cannot divide by zero (custom)");
        }

        int c = a / b;
        System.out.println(c);
    }
}