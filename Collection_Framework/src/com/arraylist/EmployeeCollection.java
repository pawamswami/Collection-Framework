package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmployeeCollection {

	public void operation() {
		System.out.println("Adding Employee Object Into ArrayList");
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		arrayList.add(new Employee(1, "Rohit Singh", "Java"));
		arrayList.add(new Employee(4, "Pawan Swami", "Spring"));
		arrayList.add(new Employee(2, "Sourabh", "Angular"));
		arrayList.add(new Employee(3, "Raja", "HTML"));

		System.out.println("Printing The Employee Details");
		Iterator<Employee> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			Employee employee = (Employee) iterator.next();
			System.out.println(employee);
		}
		
		System.out.println("After Sorting Employee Details Based On EmpID");
		Collections.sort(arrayList);
		
		Iterator<Employee> iterator2 = arrayList.iterator();
		while (iterator2.hasNext()) {
			Employee employee = (Employee) iterator2.next();
			System.out.println(employee);
		}
	}

	public static void main(String[] args) {
		EmployeeCollection employeeCollection = new EmployeeCollection();
		employeeCollection.operation();
	}
}
