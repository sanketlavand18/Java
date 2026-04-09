package com.Astudy;

import java.util.*;

public class StudentTest {
    
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(3,"C"));
        list.add(new Student(1,"A"));
        list.add(new Student(4,"B"));

        Collections.sort(list, new NewComparator());

        for(Student s : list) {
            System.out.println(s.id + " " + s.name);
        }
    }
}