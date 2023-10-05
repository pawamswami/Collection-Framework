package com.hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class StudentCollection {

	public void addStudent() {
		
		System.out.println("Passing The Custom Object In HashSet");
		 
		HashSet<Student> hashSet = new HashSet<Student>();
		hashSet.add(new Student(1,"Rohit",35.44f));
		hashSet.add(new Student(2,"Pawan",40.48f));
		hashSet.add(new Student(3,"Sourabh",60.89f));
		hashSet.add(new Student(4,"Raja",67.34f));
		hashSet.add(new Student(5,"Singh",32.42f));
		 
		
		System.out.println(hashSet);
		ArrayList<Student> arrayList = new ArrayList<Student>(hashSet);
		Collections.sort(arrayList);
		System.out.println("After Sorting");
		System.out.println(arrayList);
	}
	
	public static void main(String[] args) {
		StudentCollection studentCollection = new StudentCollection();
		studentCollection.addStudent();
	}
}
