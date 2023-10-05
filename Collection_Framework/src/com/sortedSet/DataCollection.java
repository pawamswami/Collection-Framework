package com.sortedSet;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class DataCollection {

	public void operation() {

		System.out.println("Implementing SortedSet Interface");
		 
		  SortedSet  ss= new TreeSet();
		  for(int i=10;i<=15;i++) {
			 
			  ss.add(i);
		  }
		 //  ss.add(null);
		  
		  System.out.println(ss);
		  System.out.println(ss.first());
		  
		  System.out.println(ss.last());
		  
		  System.out.println(ss.headSet(13));
		  System.out.println(ss.tailSet(12));
		  
		  System.out.println(ss.subSet(12, 14));
		  System.out.println(ss.comparator());
		  
	}

	public static void main(String[] args) {
		DataCollection dataCollection = new DataCollection();
		dataCollection.operation();
	}
}
