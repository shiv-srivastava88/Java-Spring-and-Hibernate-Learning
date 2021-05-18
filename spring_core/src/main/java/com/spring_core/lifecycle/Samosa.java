package com.spring_core.lifecycle;

public class Samosa {
	
	private double price;

	public Samosa() {
		super();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price of Samosa");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Inside Init Method of Samosa");
	}

	public void destroy() {
		System.out.println("Inside Destroy Method of Samosa");
	}
}
