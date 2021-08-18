package com.training.string;

public class StringDemo {

	public static void main(String[] args) {
		String s= "hello!How are you?";
		System.out.println("Char at 6 "+s.charAt(6));
		System.out.println("Ends with u "+s.endsWith("u"));
		
		char[] c = new char[9];
		s.getChars(5, 13, c, 1);
		for(char v : c)
			System.out.println(v);
		
		System.out.println("Index of o "+s.indexOf('o'));
		System.out.println("Index of o "+s.indexOf('o',5));
		System.out.println("Index of o "+s.lastIndexOf('o'));
		String sub = s.substring(5,12);
		System.out.println("Substring "+sub);
		String s1 = "Hello";
		String s2 = "Hello";
		System.out.println("String literals :"+s1.equals(s2));
		System.out.println("String ref "+(s1==s2));
		
		String s3 =  new String("Hello");
		String s5 = new String("Hello");
		
		System.out.println("string literals :" +s1.equals(s2));
		System.out.println("String obj "+(s3.equals(s5)));
		System.out.println("String ref "+(s5==s3));
		System.out.println("String ref "+(s1==s3));
		

	}

}
