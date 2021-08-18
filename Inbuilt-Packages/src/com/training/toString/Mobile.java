package com.training.toString;

public class Mobile {
	String name;
	double price;
	public Mobile(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public Mobile() {
		System.out.println("default");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Mobile (name=" + name + ", price=" + price + ")";
	}
	
	/*
	 * @Override public String toString() {
	 * 
	 * return ""; }
	 */
}
