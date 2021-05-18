package com.spring_core.annotationConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
		Student student = context.getBean("student", Student.class);
		System.out.println(student);
	}
}
