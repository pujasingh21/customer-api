package com.customer.data.service;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.data.controller.CustomerController;
import com.customer.data.modal.Customer;
import com.customer.data.repositary.CustomerRepositary;


@Service
public class CustomerService {
	
	private static final Logger logger=LoggerFactory.getLogger(CustomerService.class);
	
	@Autowired
	CustomerRepositary customerRepo ;
	
	
	public boolean addCustomerData(Customer data)
	{		
		boolean status = false;
		try {
			
			customerRepo.save(data);
			logger.info("Registered successfully"+data.getUsername());
			status=true;
		}catch(NullPointerException e)
		{
			logger.info("e.printStackTrace()");
		}
			
			return status;	
			
	}

}
