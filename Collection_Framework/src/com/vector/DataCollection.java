package com.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class DataCollection {

	public void operation() {
		System.out.println("Implemention of Vector Class Prsent Int List Interface");
		
		Vector vector = new Vector();
		vector.add("Rohit");// Duplicate Allowed
		vector.add("Sourabh");// Insertion Order Maintain
		vector.add("Pawan");//Hetrogeneous Data Allowed
		vector.add("Raja");// Java 1.0 V
		vector.add(123);// Sychronized
		vector.add(null);// Null Allowed
		vector.add(123.78f); // Default Capacity 10
		vector.add(true); // Incressing By Double
		vector.add(false);
		//vector.add(1224354647l);
		//vector.add("Rohit");
		
		vector.addElement("Singh");
		vector.setElementAt("Patel", 0);
		vector.removeElement("Patel");
		
		System.out.println(vector);
		int capacity = vector.capacity();
		System.out.println(capacity);
		
		System.out.println("\n");
		System.out.println("Accessing The Element From Vector Using Iterator Interface");
		Iterator iterator = vector.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.print(object+" ");
			
		}
		
		System.out.println("\n");
		System.out.println("Accessing The Element From Vector Using ListIterator Interface");
		ListIterator listIterator = vector.listIterator();
		while (listIterator.hasNext()) {
			Object object = (Object) listIterator.next();
			System.out.print(object+" ");
		}
		
		System.out.println("\n");
		System.out.println("Accessing The Element From Vector Using Enumeration Interface");
		Enumeration elements = vector.elements();
		while (elements.hasMoreElements()) {
			Object object = (Object) elements.nextElement();
			System.out.print(object+" ");
			
		}
		
	}

	public static void main(String[] args) {
		DataCollection dataCollection = new DataCollection();
		dataCollection.operation();
	}
}
