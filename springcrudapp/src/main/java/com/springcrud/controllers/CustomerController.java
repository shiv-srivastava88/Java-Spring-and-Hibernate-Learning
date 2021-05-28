package com.springcrud.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springcrud.dao.CustomerDao;
import com.springcrud.models.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private Customer customer;
	@Autowired
	private CustomerDao customerDao;

	@ResponseBody
	@RequestMapping(path = "/create", method = RequestMethod.POST)
	public String createCustomer(@RequestParam("first_name") String firstName,
			@RequestParam("last_name") String lastName, @RequestParam("location") String location) {

		customer.setCustomerId(115);
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		customer.setLocation(location);
		
		customerDao.createCustomer(customer);
		
		return "Customer "+ firstName + " " + lastName + " created successfull";
	}
	
	@ResponseBody
	@RequestMapping(path = "/getAllCustomers", method = RequestMethod.GET)
	public ResponseEntity<Map<String, List<Customer>>> getAllCustomers() {

		List<Customer> customerList = customerDao.getAllCustomers();
		
		Map<String, List<Customer>> customerMap = new HashMap<String, List<Customer>>();
//		customerMap.put("customer_list", customerList);
		
//		for (Customer customer: customerList) {
//			System.out.println(customer.toString());
//		}
		System.out.println("Hello Shivansh");
		return new ResponseEntity<Map<String, List<Customer>>>(customerMap, HttpStatus.ACCEPTED);
	}
}
