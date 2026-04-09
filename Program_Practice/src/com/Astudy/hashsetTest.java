package com.Astudy;

import java.util.HashSet;

public class hashsetTest {
	
	    public static void main(String[] args) {

	        HashSet<String> set = new HashSet<>();

	        set.add("A");
	        set.add("B");
	        set.add("A"); // duplicate ignored

	        System.out.println(set);

	        set.remove("B");

	        for(String s : set) {
	            System.out.println(s);
	        }
	    }
	
}
