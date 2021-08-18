package com.training.toString;

public class MobileMain {

	public static void main(String[] args) {
		Mobile m = new Mobile("samsung",9000);
		System.out.println(m);

		Mobile m1 = new Mobile("sony",9000);
		System.out.println(m1);
		
		Mobile m2 = new Mobile();
		m2.setName("iphone");
		m2.setPrice(6000);
		System.out.println(m2);
	}

}
