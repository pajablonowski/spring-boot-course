package com.amigoscode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @GetMapping("/greetings")
    public List<String> greetings() {
        return List.of("Hi","Hello","Buongiorno");
    }
}
