package com.customer.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.customer.data.modal.Customer;
import com.customer.data.modal.CustomerRepositary;

@Controller
public class HomeController {
	
	@Autowired
	Customer customer;
	
	@Autowired
	CustomerRepositary customerRepo ;
	
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	@RequestMapping("/register")
	public String register(Customer data)
	{
		//ModelAndView mv = new ModelAndView();
		//mv.addObject("customer", customer);
		//mv.setViewName("Welcome");
		
	// Setting values to customer
		customer.setFirstName(data.getFirstName());
		customer.setLastName(data.getLastName());
		customer.setUsername(data.getUsername());
		customer.setPassword(data.getPassword());
		customer.setAddress(data.getAddress());
		customer.setContact(data.getContact());
		customerRepo.save(customer);
		System.out.println("Registered successfully"+customer);
		
		return  "Welcome";
	}

}
