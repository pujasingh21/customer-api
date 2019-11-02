package com.customer.data.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.customer.data.modal.Customer;

public interface CustomerRepositary extends JpaRepository<Customer, Integer>{

}
