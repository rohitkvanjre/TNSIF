package com.java.tnsif.twentyseventen;

import java.util.TreeMap;

import com.java.setinterface.Student;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,Integer> courses = new TreeMap<>();
		
		courses.put("Core Java",25);
		courses.put("Python",35);
		courses.put("Hibernate",40);
		courses.put("C++",55);
		courses.put("SpringBoot",60);
		courses.put("JavaScript",99);
		//courses.put(null, null); error
		courses.put("Javascript", null);
		
		System.out.println(courses);
		
		TreeMap<Student, String> studentlist =new TreeMap<>();
		studentlist.put(new Student(101,"Harshitha"),"ECE");
		studentlist.put(new Student(104,"Pallavi"),"ISE");
		studentlist.put(new Student(102,"Anisha"),"CSE");
		studentlist.put(new Student(103,"Sheetal"),"EEE");
		System.out.println(studentlist);
		
	}

}
