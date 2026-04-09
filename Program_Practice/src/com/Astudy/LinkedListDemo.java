package com.Astudy;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		LinkedList<Integer> li=new LinkedList<>();
		
		li.add(10);
		li.add(256);
		li.add(145);
		li.add(54566);
		li.addFirst(564);
		li.addLast(444);
		
		
		System.out.println(li.get(0));
		System.out.println(li.getLast());
		System.out.println(li.getFirst());
		li.remove(1);
		
		System.out.println(li);
		for(int x: li)
		{
			System.out.println(x);
		}
	}
}
