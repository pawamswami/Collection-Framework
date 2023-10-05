package com.treeset;

public class Employee implements Comparable<Employee> {

	private int empId;
	private String empName;
	private long empContact;

	public Employee(int empId, String empName, long empContact) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empContact = empContact;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public long getEmpContact() {
		return empContact;
	}

	public void setEmpContact(long empContact) {
		this.empContact = empContact;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empContact=" + empContact + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return (int)(this.empContact-o.empContact);
	}

	

	
}
