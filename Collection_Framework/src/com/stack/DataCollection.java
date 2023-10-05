package com.stack;

import java.util.Stack;

public class DataCollection {

	public void operation() {
		System.out.println("Implementing The Stack Class Present Into List Interface");
		
		Stack stack = new Stack();
		stack.add("Rohit");
		stack.add(123);
		stack.add(null);
		stack.add(true);
		stack.add(34.67f);
		stack.add(123);
		 
		System.out.println(stack);
		
		stack.push("Singh");
		System.out.println(stack);
		
		Object pop = stack.pop();
		System.out.println(pop);
		
		System.out.println(stack);
		Object peek = stack.peek();
		System.out.println(peek);
		
		int capacity = stack.capacity();
		System.out.println(capacity);

	}
	
	public static void main(String[] args) {
		DataCollection dataCollection = new DataCollection();
		dataCollection.operation();
	}
}
