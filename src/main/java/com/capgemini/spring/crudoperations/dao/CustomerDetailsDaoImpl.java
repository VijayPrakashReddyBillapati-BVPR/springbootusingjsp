package com.capgemini.spring.crudoperations.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.capgemini.spring.crudoperations.model.CustomerDetails;

//@Repository
public class CustomerDetailsDaoImpl  {
	
	Random rand = new Random();
	Long accountNumber= rand.nextLong();
	Map<Long , CustomerDetails> CustomersData= new HashMap<Long, CustomerDetails>();
	public CustomerDetailsDaoImpl()
	{
		CustomersData.put(accountNumber, new CustomerDetails("vijay", "vijay@bvpr.com", "pass@123", "EHBPR2079F", " HYDERABAD", 987654321, 20122.10));
		CustomersData.put(accountNumber, new CustomerDetails("prakash", "prakash@bvpr.com", "pass@456", "EHBPR2089B", "MUMBAI", 987654365, 10101.50));
		CustomersData.put(accountNumber, new CustomerDetails("reddy", "reddy@bvpr.com", "pass@789", "EHBPR3011S", "CHENNAI", 898768721, 20118.47));
		
	}

	@SuppressWarnings("rawtypes")
	//@Override
	public ResponseEntity registerCustomer(CustomerDetails customerDetails) {
		customerDetails.setAccountNo(accountNumber);
		
		return new ResponseEntity(HttpStatus.OK);
	}

	//@Override
	public CustomerDetails loginCustomer(CustomerDetails customerDetails) {
		
		if(CustomersData.containsKey(customerDetails.getAccountNo()) && (customerDetails.getPassword().equals(( CustomersData.get(customerDetails.getAccountNo())).getPassword())))
		{
			CustomerDetails customerData= CustomersData.get(customerDetails.getAccountNo());
			
			return customerData;
		}
		else
		{
			return null;
		}
	
	}

}
