package com.training.inbuilt;

public class ConversionDemo {

	public static void main(String[] args) {
		
		//PDT to Object autoboxing
		int intVal = 10;
		Integer intObj = intVal;
		
		//object to pdf auto-unboxing
		int intValue = intObj;
		
		System.out.println("string to pdt");
		int a = Integer.parseInt("100");
		System.out.println(a);
		System.out.println();
		
		//possible errors that may occur
		long longVal = intVal; //upcasting
		//Long longobj = intVal;
		Long longobj = longVal; //autoboxing
		
		Object obj = intObj;//upcasting of objects
		Long longObj =(Long)obj;//class cast exception
		
		
		System.out.println("PDT to string");
		String s = Integer.toBinaryString(a);
		System.out.println("Binary "+s);
		System.out.println("Hex "+Integer.toHexString(a));
		System.out.println("Octal "+Integer.toOctalString(a));
		System.out.println("string "+Integer.toString(a));
		System.out.println("Binary "+Integer.toString(a,2));
		System.out.println();
		
		System.out.println("String to object");
		Integer s1 = Integer.valueOf("789");
		System.out.println(s1);
		
		//using const
		Double d = new Double("120");
		System.out.println("Converted "+d);
		System.out.println();
		
		System.out.println("Object to string");
		Long myvalue = 90L;
		System.out.println(myvalue.toString());
	}

}