package com.linkedhashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class ProductCollection {

	public void addProduct() {
		Product product = new Product(1, "Milk", 34.89f);
		Product product2 = new Product(4, "Shop", 56.89f);
		Product product3 = new Product(2, "Butter", 90.89f);
		Product product4 = new Product(8, "Maggie", 35.89f);
		Product product5 = new Product(6, "Suger", 43.89f);
		Product product6 = new Product(3, "Coffee", 10.89f);
		
		
		System.out.println("Passing User Define Object Into LinkedHashSet");
		LinkedHashSet<Product> linkedHashSet = new LinkedHashSet<Product>();
		linkedHashSet.add(product);
		linkedHashSet.add(product2);
		linkedHashSet.add(product3);
		linkedHashSet.add(product4);
		linkedHashSet.add(product5);
		linkedHashSet.add(product6);
		linkedHashSet.add(product);
	
		System.out.println("Accessing The Element From LinkedHashSet");
		System.out.println(linkedHashSet);
		
		ArrayList<Product> arrayList = new ArrayList<Product>(linkedHashSet);
		System.out.println("After Sorting");
		Collections.sort(arrayList);
		System.out.println(arrayList);
	}
	
	public static void main(String[] args) {
		ProductCollection productCollection = new ProductCollection();
		productCollection.addProduct();
	}
}
