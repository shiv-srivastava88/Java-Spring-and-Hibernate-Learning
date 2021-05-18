package com.spring_core.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring_core/lifecycle/config.xml");
		Samosa samosa = (Samosa) context.getBean("samosa1");
		System.out.println(samosa);

		context.registerShutdownHook();

		Pepsi pepsi = (Pepsi) context.getBean("pepsi1");
		System.out.println(pepsi);

		Momos momos = (Momos) context.getBean("momos1");
		System.out.println(momos);
	}

}
