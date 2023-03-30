package com.amigoscode.controller;


import com.amigoscode.model.Customer;
import com.amigoscode.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {


    private final CustomerService customerService;

    public CustomerController(final CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getuserList() {
        return customerService.getAllCustomers();
    }


    record NewCustomerRequest(String name, String email, Integer age) {
    }

    @PostMapping
    public void addCustomer(@RequestBody NewCustomerRequest request) {
        Customer customer = new Customer();
        customer.setName(request.name());
        customer.setEmail(request.email());
        customer.setAge(request.age());
        customerService.saveOrUpdate(customer);
    }

    @DeleteMapping("{customerId}")
    public void deleteCustomer(@PathVariable("customerId") Long id) {
        customerService.deleteCustomerById(id);
    }

    @PutMapping("{customerId}")
    public void updateCustomer(
            @PathVariable("customerId") Long id,
            @RequestBody NewCustomerRequest request) {
        Optional<Customer> customerById = customerService.getCustomerById(id);
        if (customerById.isPresent()) {
            Customer customer = customerById.get();
            customer.setName(request.name());
            customer.setEmail(request.email());
            customer.setAge(request.age());
            customerService.saveOrUpdate(customer);
        } else throw new IllegalArgumentException("Customer with given id doesn't exist");
    }
}