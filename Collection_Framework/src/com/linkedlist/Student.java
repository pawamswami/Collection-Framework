package com.linkedlist;

public class Student implements Comparable<Student> {

	int stdId;
	String stdName;
	String stdBranch;

	public Student(int stdId, String stdName, String stdBranch) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdBranch = stdBranch;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdBranch() {
		return stdBranch;
	}

	public void setStdBranch(String stdBranch) {
		this.stdBranch = stdBranch;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdBranch=" + stdBranch + "]";
	}

	@Override
	public int compareTo(Student o) {
		 
		return this.stdName.compareTo(o.stdName);
	}
	
	

}
