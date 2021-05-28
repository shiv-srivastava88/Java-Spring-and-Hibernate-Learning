package com.springcrud.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springcrud.models.Customer;

@Repository
public class CustomerDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	// create customer
	@Transactional
	public int createCustomer(Customer customer) {
		// insert
		Integer i = (Integer) this.hibernateTemplate.save(customer);
		return i;
	}

	// get all customers(all rows)
	public List<Customer> getAllCustomers() {
		List<Customer> students = this.hibernateTemplate.loadAll(Customer.class);
		return students;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
