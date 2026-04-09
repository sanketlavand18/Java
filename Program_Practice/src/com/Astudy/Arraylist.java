package com.Astudy;

import java.util.ArrayList;

public class Arraylist {
	
	public static void main(String[] args) {
		
	
	ArrayList<String> list=new ArrayList<>();
	list.add("a");
	list.add("c");
	list.add("p");
	list.add(2,"l");
	
	for(String s:list)
	{
		System.out.println(s);
	}
	
	System.out.println(list.get(0));
	System.out.println(list.set(1,"s"));
	System.out.println(list.remove(0));
	System.out.println(list.remove("s"));
	System.out.println(list.size());
	System.out.println(list.isEmpty());
	System.out.println(list.contains("c"));
	Object[] arr=list.toArray();
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	list.clear();
	System.out.println(list);
	}
}
