package com.day_2;

public class StringFunction {

		public static void main(String [] args)
		{
			// length of string
			String s1="welcome back to java";
			System.out.println(s1.length());
			
			
			//find substring from 2 to 5 index position character
			System.out.println("substr "+s1.substring(2,6));
			
			//find substring starting from 2 till end
			System.out.println("substr "+s1.substring(2));
			
			//to find one charcter at the given position
			System.out.println("charAt "+s1.charAt(6));
			
			//convert to lowercase
			System.out.println("lowercase "+s1.toLowerCase());
			
			System.out.println("uppercase "+s1.toUpperCase());
			
			// count the number of words in string
			System.out.println("split "+s1.split(" ").length);
			
			// join all the string ufing String.join(":",...........)
			System.out.println("join "+String.join(":",s1, "pppppp","yyyy"));
			
			// check both string are same or not
			System.out.println("equals "+s1.equals("hello"));
			
			// compare the both string 
			// which is greater and smaller
//			0 → both strings equal
//			Negative → current string is smaller
//			Positive → current string is greater
			System.out.println("compareTo "+s1.compareTo("a"));
			
		}


}
