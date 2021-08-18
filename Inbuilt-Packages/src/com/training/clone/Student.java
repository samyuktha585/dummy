package com.training.clone;

public class Student implements Cloneable {
	String name;
	int studentId;

	public Student(String name, int studentId) {
		super();
		this.name = name;
		this.studentId = studentId;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println("cloning");
		return super.clone();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", studentId=" + studentId + "]";
	}

}
