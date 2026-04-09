package com.Astudy;

import java.util.LinkedHashSet;

public class TreeSetTest {
	
	
	    public static void main(String[] args) {
	        
	        LinkedHashSet<String> set = new LinkedHashSet<>();
	        
	        set.add("A");
	        set.add("B");
	        set.add("C");
	        set.add("A"); // duplicate ignored
	        
	        System.out.println(set);
	    }
}
