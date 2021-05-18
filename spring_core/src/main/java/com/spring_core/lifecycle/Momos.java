package com.spring_core.lifecycle;

public class Momos {
	
	private String price;

	public Momos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Momos [price=" + price + "]";
	}

	public void start() {
		System.out.println("Inside start method of Momos");
	}

	public void end() {
		System.out.println("Inside end method of Momos");
	}
	
}
