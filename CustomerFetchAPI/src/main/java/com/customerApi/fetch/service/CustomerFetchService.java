package com.customerApi.fetch.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customerApi.fetch.repository.CustomerRepositary;

@Service
public class CustomerFetchService {
	
	private final static Logger logger=LoggerFactory.getLogger(CustomerFetchService.class);
	
	@Autowired
	CustomerRepositary repo;
	
	public String getCustomersData()
	{
		logger.info("Inside service :"+repo.findAll().toString());
		return repo.findAll().toString();
	}
	
	public String getCustomerDataById(int id)
	{
		logger.info("Inside service: "+repo.findById(id).toString());
		return repo.findById(id).toString();
	}

}
