package com.amigoscode.controller;


import com.amigoscode.model.Customer;
import com.amigoscode.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {


    private CustomerService customerService;

    public CustomerController(final CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getuserList() {
        return customerService.getAllCustomers();
    }

}
