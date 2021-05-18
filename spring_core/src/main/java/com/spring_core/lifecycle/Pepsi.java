package com.spring_core.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean{
	
	private double price;

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price of Pepsi");
		this.price = price;
	}

	public Pepsi() {
		super();
	}

	public void destroy() throws Exception {
		System.out.println("Inside Destroy method of Pepsi");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside afterPropertiesSet method of Pepsi");
	}
}
