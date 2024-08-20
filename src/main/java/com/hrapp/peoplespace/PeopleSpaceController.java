package com.hrapp.peoplespace;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeopleSpaceController {

    @RequestMapping
    public String peopleSpace() {
        return "Hello World from Spring Boot";
    }

    @RequestMapping("/goodbye")
    public String goodbye() {
        return "Goodbye World from Spring Boot";
    }
}
