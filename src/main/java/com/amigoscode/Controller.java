package com.amigoscode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @GetMapping("/greetings")
    public List<GreetResponse> greetings() {
        return List.of(
                new GreetResponse(
                        1,
                        "Hi",
                        List.of("AA", "BB"),
                        new Person(
                                "Paweł",
                                34,
                                true,
                                30_000)),
                new GreetResponse(
                        2,
                        "Hello",
                        List.of("CC", "DD"),
                        new Person(
                                "Aga",
                                30,
                                false,
                                45_00.76))
        );
    }

    record Person(String firstName, int age, boolean active, double savings) {
    }

    record GreetResponse(
            Integer id,
            String greet,
            List<String> favProgrammingLanguage,
            Person person
    ) {
    }
}
