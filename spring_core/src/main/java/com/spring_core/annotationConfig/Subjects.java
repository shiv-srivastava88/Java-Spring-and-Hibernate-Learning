package com.spring_core.annotationConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Subjects {
	
	@Value("4")
	private int noOfSubjects;
	@Value("Maths")
	private String bestSubject;
	
	public int getNoOfSubjects() {
		return noOfSubjects;
	}
	public void setNoOfSubjects(int noOfSubjects) {
		this.noOfSubjects = noOfSubjects;
	}
	public String getBestSubject() {
		return bestSubject;
	}
	public void setBestSubject(String bestSubject) {
		this.bestSubject = bestSubject;
	}
	@Override
	public String toString() {
		return "Subjects [noOfSubjects=" + noOfSubjects + ", bestSubject=" + bestSubject + "]";
	}
	
}	
