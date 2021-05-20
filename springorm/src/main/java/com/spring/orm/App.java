package com.spring.orm;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =  new ClassPathXmlApplicationContext("config.xml");
    	StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
    	
    	Scanner sc = new Scanner(System.in);
    	boolean go = true;
    	while(go) {
    		
    		System.out.println("Press 1 to add new student");
    		System.out.println("Press 2 to display all students");
    		System.out.println("Press 3 to get details of single student");
    		System.out.println("Press 4 to delete students");
    		System.out.println("Press 5 to update student");
    		System.out.println("Press 6 to exit");
    		
    		try {
    			
    			int choice = sc.nextInt();
    			
    			switch(choice) {
    			
    			case 1: 
    				//add new student
    				
    				// taking inputs from user
    				System.out.println("Enter student id: ");
    				int uid = sc.nextInt();
    				sc.nextLine();
    				
    				System.out.println("Enter student name: ");
    				String uname = sc.nextLine();
    			
    				System.out.println("Enter student city: ");
    				String ucity = sc.nextLine();
    				
    				// creating student object and setting values
    				Student s = new Student();
    				s.setStudentId(uid);
    				s.setStudentName(uname);
    				s.setStudentCity(ucity);
    				
    				// saving student object to database by calling insert() of studentDao
    				int r = studentDao.insert(s);
    				System.out.println(r + " student added \n");
    				
    				break;
    				
    			case 2: 
    				//display all students
    				
    				List<Student> allStudents = studentDao.getAllStudents();
    				
    				System.out.println("\nList of all students...\n");
    				for(Student student: allStudents) {
    					System.out.println(student.toString());
    				}
    				System.out.println("\n");
    				
    				break;
    				
    			case 3: 
    				//get details of all students
    				
    				break;
    				
    			case 4: 
    				//delete student
    				
    				System.out.println("Enter student id to be deleted: ");
    				int id = sc.nextInt();
    				studentDao.deleteSudent(id);
    				
    				System.out.println("\nStudent with id-" + id + " deleted successfully.\n");
    				break;

    			case 5: 
    				//update student
    				break;
    				
    			case 6: 
    				// exit
    				go = false;
    				break;
    			}
    			
				
			} catch (Exception e) {
				System.out.println("Inalid Input...");
				System.out.println(e.getMessage());
			}
    	}
    	
    	System.out.println("Thank you for using my application...");
    }
}
