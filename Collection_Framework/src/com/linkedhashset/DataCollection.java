package com.linkedhashset;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class DataCollection {

	public void operation() {
		System.out.println("Implementing The LinkedHashSet Class Prsent In Set Category");
		LinkedHashSet linkedHashSet = new LinkedHashSet();
		linkedHashSet.add("Rohit"); // Insertion Order  Maintain
		linkedHashSet.add("Pawan"); // Hetrogeneous Data Allowed
		linkedHashSet.add(123); // Introduce Java 1.2 V
		linkedHashSet.add(34.56f); // Not Synchronized
		linkedHashSet.add(true);
		linkedHashSet.add(false);
		linkedHashSet.add(null); // Only One Null Allowed
		linkedHashSet.add(123456789l);
		linkedHashSet.add("Pawan"); // Duplicate Not Allowed
		linkedHashSet.add("Rohit");
		linkedHashSet.add("Sourabh");
		linkedHashSet.add("Raja");
		linkedHashSet.add("Singh");
		
		System.out.println("Access The Data From LinkedHashSet");
		System.out.println(linkedHashSet);
		
		System.out.println("\nAccessing The Element Using Iterator Interface");
		Iterator iterator = linkedHashSet.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.print(object+" ");
		}
		
		System.out.println("\n\nAccessing The Element Using ListIterator Interface");
		ArrayList<Object> arrayList = new ArrayList<>(linkedHashSet);
		ListIterator<Object> listIterator = arrayList.listIterator();
		while (listIterator.hasNext()) {
			Object object = (Object) listIterator.next();
			System.out.print(object+" ");
		}	}

	public static void main(String[] args) {
		DataCollection dataCollection = new DataCollection();
		dataCollection.operation();
	}
}
