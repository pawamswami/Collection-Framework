package com.vector;

import java.util.Collections;
import java.util.Vector;

public class ProductCollection {

	public void addProduct() {
		
		System.out.println("Adding The Product Details into Vector");
		
		Vector<Product> vector = new Vector<Product>();
		vector.addElement(new Product(8,"Milk",30.25f));
		vector.addElement(new Product(3,"Shop",38.35f));
		vector.addElement(new Product(7,"Butter",20.20f));
		vector.addElement(new Product(12,"Maggie",24.50f));
		vector.addElement(new Product(15,"Toothpest",80.60f));
		vector.addElement(new Product(22,"Brush",45.25f));
		
		System.out.println(vector);
		Collections.sort(vector);
		System.out.println(vector);
		
	}
	
	public static void main(String[] args) {
		ProductCollection productCollection = new ProductCollection();
		productCollection.addProduct();
	}
}
