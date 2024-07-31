package org.snowpark.service;

import org.snowpark.model.Customer;
import org.snowpark.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService{

	private CustomerRepository customerRepository;
	

	@Override
	public Customer addCustomer(Customer customer) {
		
		return customerRepository.save(customer);

	}
}
