package com.capgemini.spring.crudoperations.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.capgemini.spring.crudoperations.dao.CustomerDetailsDao;
import com.capgemini.spring.crudoperations.model.CustomerDetails;

@Service
public class CustomerDetailsServiceImpl implements CustomerDetailsService {
	
	@Autowired
	CustomerDetailsDao customerDetailsDao;

	@Override
	public String registerCustomer(CustomerDetails customerDetails) {
		customerDetailsDao.save(customerDetails);
		return "successfully registered";
	}

	@Override
	public CustomerDetails loginCustomer(CustomerDetails customerDetails) {
		
		Optional<CustomerDetails> result = customerDetailsDao.findById(customerDetails.getAccountNo());
		
		CustomerDetails theCustomer = null;
		
		if (result.isPresent()) {
			theCustomer = result.get();
		}
		else {
			// we didn't find the employee
			throw new RuntimeException("Did not find employee id - " + customerDetails.getAccountNo());
		}
		
		return theCustomer;
	}

	@Override
	public List<CustomerDetails> getAllUsers() {
		
		return customerDetailsDao.findAll();
	}

	@Override
	public CustomerDetails getUserById(Long id) {
		
		return customerDetailsDao.getOne(id);
	}

	@Override
	public void update(CustomerDetails customerDetails) {
		customerDetailsDao.save(customerDetails);
		
	}

	@Override
	public void delete(Long id) {
		customerDetailsDao.deleteById(id);
		
	}



}
