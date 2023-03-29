package com.amigoscode.controller;


import com.amigoscode.model.Customer;
import com.amigoscode.repository.CustomerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/vq/customers")
public class CustomerController {

    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }


    @GetMapping
    public List<Customer> getCustomersList(){
        return customerRepository.findAll();
    }

}
