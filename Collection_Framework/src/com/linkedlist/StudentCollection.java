package com.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class StudentCollection {

	public void addStudent() {

		System.out.println("Passing User Define Object Into LinkedList And Sorting The User Define Object");
		LinkedList<Student> linkedList = new LinkedList<Student>();
		linkedList.add(new Student(15,"Rohit", "JAVA"));
		linkedList.add(new Student(12,"Sourabh","HTML"));
		linkedList.add(new Student(17,"Raja", "Spring"));
		linkedList.add(new Student(18,"Pawan", "CSS"));
		linkedList.add(new Student(5,"Amit", "JDBC"));
		
		System.out.println(linkedList);
		Collections.sort(linkedList);
		System.out.println("After sorting The Collection");
		System.out.println(linkedList);
	}

	public static void main(String[] args) {
		StudentCollection studentCollection = new StudentCollection();
		studentCollection.addStudent();
	}
}
