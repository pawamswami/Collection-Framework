package com.arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class DataCollection {

	public void operation() {
		System.out.println("------- Implimenting Array List From List Interface -------");

		// List list = new ArrayList();
		ArrayList list = new ArrayList();

		list.add("Sourabh");// Hetrogeneus Data Allow
		list.add("Pawan"); // Duplicate Are Allowed
		list.add(123); // Insertion Order Maintain
		list.add(12.45f); // null Allowed
		list.add(true); // Java 1.2V
		list.add(null); // Not Synchronized
		list.add("Sourabh");
		list.add(2159842323l);

		System.out.println(list);

		System.out.println();
		System.out.println("Using For Loop Access The Element From ArrayList");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

		System.out.println("\n");
		System.out.println("Using For each Loop Access The Element From ArrayList");
		for (Object value : list) {
			System.out.print(value + " ");

		}

		System.out.println("\n");
		System.out.println("Using Iterator Access The Element From ArrayList");
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			Object next = iterator.next();
			System.out.print(next + " ");
		}

		System.out.println("\n");
		System.out.println("Using ListIterator Access The Element From ArrayList");
		ListIterator listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			Object object = (Object) listIterator.next();
			System.out.print(object + " ");

		}
		

		HashSet<Object> hashSet = new HashSet<>();
		hashSet.add(123);
		hashSet.add(567);
		hashSet.add(890);
		hashSet.add(234);
		hashSet.add(675);
		hashSet.add(678);
		
		System.out.println(hashSet);
		
		ArrayList<Object> arrayList = new ArrayList<>(hashSet);
		System.out.println(arrayList);

	}

	public static void main(String[] args) {
		DataCollection collection = new DataCollection();
		collection.operation();

	}
}
