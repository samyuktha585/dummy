package com.training.clone;

public class CloneMain {
	public static void main(String[] args) {
		Student s = new Student("Ram",10);
		System.out.println(s);
		Student s1 = null;
		try
		{
		 s1 =  (Student)s.clone();
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println(e);
		}
		System.out.println(s1);
		
	}

}
