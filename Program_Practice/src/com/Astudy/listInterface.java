package com.Astudy;

import java.util.ArrayList;
import java.util.List;

public class listInterface {
	
public static void main(String[] args) {
	

	List<String> list = new ArrayList<>();
	list.add("Apple");
	list.add("30");
	list.add("Apple");// duplicate allowed
	list.add(1,"coconut");
	list.remove(3);
	System.out.println(list);
	
	List<ObjectList> list1 = new ArrayList<>();

    // Creating objects
	ObjectList s1 = new ObjectList(1, "Ram");
    ObjectList s2 = new ObjectList(2, "Shyam");
    ObjectList s3 = new ObjectList(3, "Amit");

    // Adding objects to list
    list1.add(s1);
    list1.add(s2);
    list1.remove(s3);
   System.out.println( list1.indexOf(s2));

    // Accessing objects from list
    for (ObjectList s : list1) {
        s.display();
    }
    ArrayList<Integer> list2=new ArrayList<>();
    list2.add(55);
    
    
    
}
}
