package com.amigoscode.controller;


import com.amigoscode.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @GetMapping("/users")
    public List<Customer> getuserList(){
        return List.of(
        );
    }

}
