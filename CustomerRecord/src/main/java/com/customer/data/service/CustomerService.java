package com.customer.data.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.data.modal.Customer;
import com.customer.data.repositary.CustomerRepositary;


@Service
public class CustomerService {
	
	@Autowired
	CustomerRepositary customerRepo ;
	
	
	public boolean addCustomer(Customer data)
	{		
		try {
			
			customerRepo.save(data);
		}catch(NullPointerException e)
		{
			System.out.println("e");
		}
			
			return true;	
			
	}

}
