package com.customerApi.api.services;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customerApi.api.modals.Customer;
import com.customerApi.api.repositories.CustomerRepository;




@Service
public class CustomerService {
	
	private static final Logger logger=LoggerFactory.getLogger(CustomerService.class);
	
	@Autowired
	CustomerRepository customerRepo ;
	
	
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
