package com.linkedlist;

import java.util.LinkedList;

public class IntegerDataCollection {

	public void operation() {
		System.out.println("Implementing LinkedList Using Generic Concept");
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(89);
		linkedList.add(445);
		linkedList.add(65);
		linkedList.add(567);
		linkedList.add(234);
		linkedList.add(324);
		 
		System.out.println(linkedList);
	}
	
	public static void main(String[] args) {
		IntegerDataCollection integerDataCollection = new IntegerDataCollection();
		integerDataCollection.operation();
	}
}
