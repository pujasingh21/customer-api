package com.customer.data.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.customer.data.modal.Customer;
import com.customer.data.repositary.CustomerRepositary;
import com.customer.data.service.CustomerService;


@Controller
public class CustomerController {
	CustomerService customerService = new CustomerService();
	
	@Autowired
	CustomerRepositary repo;
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	@PostMapping("/register")
	
	
	public ResponseEntity <Customer> register(@RequestBody Customer data)
	{
		System.out.println("Registered successfully"+data);
		
		repo.save(data);
		
		
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

}
