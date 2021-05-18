package com.spring_core.annotationConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("Shivansh Srivastava")
	private String name;
	@Value("Kanpur")
	private String city;
	
	@Autowired
	private Subjects subject;
	
	public Subjects getSubject() {
		return subject;
	}
	public void setSubject(Subjects subject) {
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", subject=" + subject + "]";
	}
	
}
