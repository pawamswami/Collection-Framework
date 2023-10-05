package com.linkedhashset;

import java.util.Collections;
import java.util.LinkedHashSet;

public class CharaterDataCollection {

	public void addCharacterData() {
		System.out.println("Adding Character Data Using Generic Concept In LinkedHashSet");
		LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<Character>();
		linkedHashSet.add('a');
		linkedHashSet.add('b');
		linkedHashSet.add('c');
		linkedHashSet.add('d');
		linkedHashSet.add('e');
		
		System.out.println(linkedHashSet);
	
	}
	
	public static void main(String[] args) {
		CharaterDataCollection charaterDataCollection = new CharaterDataCollection();
		charaterDataCollection.addCharacterData();
	}
}
