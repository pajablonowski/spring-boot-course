package com.amigoscode.controller;


import com.amigoscode.model.Customer;
import com.amigoscode.repository.CustomerRepository;
import com.amigoscode.service.CustomerService;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {


    CustomerService customerService;

    public CustomerController(CustomerRepository customerRepository){
        this.customerService = new CustomerService(customerRepository);
    }

    @GetMapping
    public List<Customer> getuserList() {
        return customerService.getAllCustomers();
    }

}
