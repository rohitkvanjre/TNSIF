package com.java.setinterface;

import java.util.Set;
//import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> courses = new TreeSet<>();
		courses.add("Core Java");
		courses.add("Python");
		courses.add("Hibernate");
		courses.add("C++");
		courses.add("SpringBoot");
		courses.add("JavaScript");
		System.out.println(courses);
		
		Set<String> coursesubSet = courses.subSet("JavaScript", true, "SpringBoot", true);
		System.out.println(courses.subSet("JavaScript", "SpringBoot"));
		courses.add("HTML");
		courses.add("React");
		
		System.out.println(coursesubSet);
		
		TreeSet<Student> studentList = new TreeSet<>();
		studentList.add(new Student(101, "Harshitha"));
		studentList.add(new Student(101, "Pallavi"));
		studentList.add(new Student(101, "Anisha"));
	}

}