package com.lokeshSpring.lokeshSpringCourse.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // exposr "/" that returns "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }
}
