package com.training.clone;

public class Student1 implements Cloneable {
	String name;
	int studentId;

	public Student1(String name, int studentId) {
		super();
		this.name = name;
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println("cloning....");
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
