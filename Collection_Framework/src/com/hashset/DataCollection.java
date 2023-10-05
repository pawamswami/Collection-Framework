package com.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class DataCollection {

	public void operation() {
		System.out.println("Implementing HashSet Class Present In Set Category");
		
		HashSet hashSet = new HashSet();
		
		hashSet.add("Rohit"); //Insertion Order Not Maintain
		hashSet.add("Pawan"); // Hetrogeneous Data Allowed
		hashSet.add(123); // Introduce Java 1.2 V
		hashSet.add(34.56f); // Not Synchronized
		hashSet.add(true);
		hashSet.add(false);
		hashSet.add(null); // Only One Null Allowed
		hashSet.add(123456789l);
		hashSet.add("Pawan"); // Duplicate Not Allowed
		hashSet.add("Sourabh");
		hashSet.add("Raja");
		hashSet.add("Singh");
		
		System.out.println("Accessing The Element From HashSet");
		System.out.println(hashSet);
		System.out.println(hashSet.size());
		boolean contains = hashSet.contains("Raja");
		System.out.println(contains);
		
		System.out.println("\n");
		System.out.println("Accessing The Element Using Iterator Interface");
		Iterator iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.print(object+" ");
		}
	}

	public static void main(String[] args) {
		DataCollection dataCollection = new DataCollection();
		dataCollection.operation();
	}

}
