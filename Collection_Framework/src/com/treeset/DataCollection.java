package com.treeset;

import java.util.TreeSet;

public class DataCollection {

	public void operation() {
		System.out.println("Implementing TreeSet From SortedSet Interface");
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(10); // Insertion Order In Sorting Order Natural Shorting
		treeSet.add(2);  // Java 1.2 V
		treeSet.add(12); // Not Synchronized
		treeSet.add(8);  // Default 16 
		treeSet.add(15); // Load Factor 0.75
		treeSet.add(7);
		treeSet.add(13);
		treeSet.add(16);
		treeSet.add(10); // duplicate are not allowed
		//treeSet.add(null); //NullPointerException
		//treeSet.add("Rohit"); // Hetrogeneous data Not Allowed
		
		System.out.println("Accessing The Element From TreeSet");
		System.out.println(treeSet);
		
	}
	
	public static void main(String[] args) {
		DataCollection dataCollection = new DataCollection();
		dataCollection.operation();
	}
}
