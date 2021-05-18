package com.spring_core.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring_core/standalone/collections/alone_config.xml");
		
		Person person = (Person) context.getBean("Person1");
		System.out.println("Friends : "+ person.getFriends());
		System.out.println("FeesStructure : "+ person.getFeeStructure());
	}
}
