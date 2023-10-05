package com.treeset;

import java.util.TreeSet;

public class EmployeeCollection {

	public void addEmployee() {
		System.out.println("Passing Employee Object Into treeSet");
		TreeSet<Employee> treeSet = new TreeSet<Employee>();
        treeSet.add(new Employee(123, "Rohit", 7408076562l));
        treeSet.add(new Employee(234, "Mohit", 8960603843l));
        treeSet.add(new Employee(133, "Sourabh", 6266152077l));
        treeSet.add(new Employee(645, "Raja", 7981250423l));
        treeSet.add(new Employee(322, "Pawan", 7610174656l));
        
        System.out.println(treeSet);
        
	}
	
	public static void main(String[] args) {
		EmployeeCollection employeeCollection = new EmployeeCollection();
		employeeCollection.addEmployee();
	}
}
