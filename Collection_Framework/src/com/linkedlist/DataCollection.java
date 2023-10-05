package com.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class DataCollection {

	public void operation() {
		System.out.println("Implimention Of LinkedList Prsent Int List Interface");

		LinkedList list = new LinkedList();
		list.add("Sourabh");// Duplicate Allowed
		list.add("Pawan"); // Insertion Order Maintain
		list.add("RAJA");//Null Allowed
		list.add("Rohit");//Hetrogenous Data Allow
		list.add(123);//Not Sychronized
		list.add(123.67f);//Java 1.2 V
		list.add(true);//
		list.add(false);
		list.add(21345678l);
		list.add(null);
		list.add("Rohit");

		System.out.println(list);

		System.out.println("\n");
		System.out.println("Accessing The Element From LinkedList Using For Loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

		System.out.println("\n");
		System.out.println("Accessing The Element From LinkedList Using For Each Loop");
		for (Object value : list) {
			System.out.print(value + " ");
		}

		System.out.println("\n");
		System.out.println("Accessing The Element From LinkedList Using Iterator");
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.print(object + " ");
			// iterator.remove();

		}

		System.out.println("\n");
		System.out.println("Accessing The Element From LinkedList Using ListIterator");
		ListIterator listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			Object object = (Object) listIterator.next();
			System.out.print(object + " ");
			// listIterator.add("XYZ");

		}

		System.out.println("\n");
		System.out.println(list);
		list.addFirst("Mohit");
		System.out.println(list);
		list.addLast("Singh");
		System.out.println(list);
		Object first = list.getFirst();
		System.out.println(first);
		Object last = list.getLast();
		System.out.println(last);
		
		Object removeFirst = list.removeFirst();
		System.out.println(list);
		Object removeLast = list.removeLast();
		System.out.println(list);



	}

	public static void main(String[] args) {
		DataCollection collection = new DataCollection();
		collection.operation();
	}

}
