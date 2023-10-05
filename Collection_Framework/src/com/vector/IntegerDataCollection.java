package com.vector;

import java.util.Vector;

public class IntegerDataCollection {

	public void operation() {

		System.out.println("Implement Vector Class Using Generic Concept");
		Vector<Integer> vector = new Vector<Integer>();
		vector.addElement(123);
		vector.addElement(342432);
		vector.addElement(432);
		vector.addElement(125543);
		vector.addElement(12873);
		
		System.out.println(vector);
	}

	public static void main(String[] args) {
		IntegerDataCollection obj = new IntegerDataCollection();
		obj.operation();
		
	}
}
