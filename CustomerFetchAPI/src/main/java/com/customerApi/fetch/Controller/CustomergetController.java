package com.customerApi.fetch.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.customerApi.fetch.repository.CustomerRepositary;

@RestController
public class CustomergetController {
	
	@Autowired
	CustomerRepositary repo;
	
	
	@GetMapping("/getCustomer")
	@ResponseBody
	public String getCustomer()
	{
		
		return repo.findAll().toString();		
		
	}
	@GetMapping("getCustomer/{id}")
	@ResponseBody
	public String getCustomerById(@PathVariable("id") int id)
	{
		return repo.findById(id).toString();
	}

}
