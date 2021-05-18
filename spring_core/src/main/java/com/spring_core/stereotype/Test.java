package com.spring_core.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring_core/stereotype/stereo_config.xml");
		Student student = context.getBean("student", Student.class);

		System.out.println(student);
	}
}
