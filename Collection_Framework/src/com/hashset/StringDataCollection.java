package com.hashset;

import java.util.HashSet;

public class StringDataCollection {

	public void getString() {
		System.out.println("Implementing The HashSet With Generic Concept");
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Pawan");
		hashSet.add("Rohit");
		hashSet.add("Sourabh");
		hashSet.add("Raja");
		hashSet.add("Kali");
		hashSet.add("Gori");
		hashSet.add("Patali");
		hashSet.add("Moti");
		hashSet.add("Chhoti");
		 
		
		System.out.println(hashSet);
		
	}
	
	public static void main(String[] args) {
		StringDataCollection stringDataCollection = new StringDataCollection();
		stringDataCollection.getString();
	}
}
