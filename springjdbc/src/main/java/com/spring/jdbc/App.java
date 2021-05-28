package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Starting my program...");
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
        
        // Insert query 
        String query = "insert into student(id, name, city) values(?, ?, ?)";
        
        // Fire query
        int result = template.update(query, 13, "Vedant Singh", "Banaras");
        System.out.println("Number of rows inserted... " + result);
    }
}
