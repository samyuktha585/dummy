package com.training.clone;

public class CloneMain1 {

	public static void main(String[] args) {
		Student1 s1 = new Student1("Ram",10);
		System.out.println("Student-1 "+s1);
		Student1 s2 = null;
		try
		{
		s2 = (Student1)s1.clone();
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println(e);
		}
		System.out.println("Student-2 "+s2 );
		System.out.println();
		s2.setName("Tom");
		System.out.println("Student-2 "+s2);
		System.out.println("Student-1 "+s1);
		
	}

}

