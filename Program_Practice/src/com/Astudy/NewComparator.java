package com.Astudy;

import java.util.Comparator;

public class NewComparator implements Comparator<Student>{
	
//	public int compare(Student s1, Student s2) {
//        return s1.name.compareTo(s2.name);
//	}

	public int compare(Student s1,Student s2)
	{
		return s1.id-s2.id;
	}
	
}
