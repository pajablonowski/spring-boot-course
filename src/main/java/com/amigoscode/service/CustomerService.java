package com.amigoscode.service;

import com.amigoscode.model.Customer;
import com.amigoscode.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(final CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public void saveOrUpdate(Customer customer){
        customerRepository.save(customer);
    }

    public void deleteCustomerById(Long id){
        customerRepository.deleteById(id);
    }
    public Optional<Customer> getCustomerById(Long id){
        return customerRepository.findById(id);
    }

}
