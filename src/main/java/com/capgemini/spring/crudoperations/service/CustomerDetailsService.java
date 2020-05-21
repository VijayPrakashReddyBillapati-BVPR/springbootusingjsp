package com.capgemini.spring.crudoperations.service;
import java.util.List;

import com.capgemini.spring.crudoperations.model.CustomerDetails;

public interface CustomerDetailsService {

	
	String registerCustomer(CustomerDetails customerDetails);

	CustomerDetails loginCustomer(CustomerDetails customerDetails);

	List<CustomerDetails> getAllUsers();

	CustomerDetails getUserById(Long id);

	void update(CustomerDetails customerDetails);

	void delete(Long id);

}
