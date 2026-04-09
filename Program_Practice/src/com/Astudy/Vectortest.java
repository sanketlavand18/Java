package com.Astudy;

import java.util.Vector;

public class Vectortest {
	
	public static void main(String[] args) {
		Vector <Integer> demo=new Vector<>();	
		
		demo.add(4569);
		demo.add(4568);
		demo.add(0, 4795);
		demo.addFirst(45755);
		demo.addLast(48455);
		
		System.out.println(demo);
		demo.remove(3);;
		System.out.println(demo);
		
	}

}
