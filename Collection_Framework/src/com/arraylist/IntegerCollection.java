package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerCollection {

	public void operation() {
		System.out.println("Implementing ArrayList Using Generic Concept");

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(123);
		arrayList.add(342);
		arrayList.add(567);
		arrayList.add(12324);
		arrayList.add(987);
		arrayList.add(123);
		
		System.out.println(arrayList);
		Collections.sort(arrayList);
		System.out.println("After Sorting ArrayList Element");
		System.out.println(arrayList);

	}

	public static void main(String[] args) {
		IntegerCollection integerCollection = new IntegerCollection();
		integerCollection.operation();

	}
}
