package com.amigoscode.service;

import com.amigoscode.model.Customer;
import com.amigoscode.repository.CustomerRepository;

import java.util.List;

public class CustomerService {

    CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

}
