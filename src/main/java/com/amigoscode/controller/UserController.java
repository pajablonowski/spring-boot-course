package com.amigoscode.controller;


import com.amigoscode.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @GetMapping("/users")
    public List<User> getuserList(){
        return List.of(
                new User.UserBuilder()
                        .id(1L)
                        .name("Paweł")
                        .email("pajablonowski@gmail.com")
                        .age(34)
                        .build(),
                new User.UserBuilder()
                        .id(2L)
                        .name("Aga")
                        .email("agamroz@gmail.com")
                        .age(30)
                        .build()
        );
    }

}
