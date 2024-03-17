package com.lokeshSpring.lokeshSpringCourse.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// here we created a package called as rest controller and init we are initializing the controller
// when ever a get request is called sayHello method will be executed
@RestController
public class FunRestController {
    // exposr "/" that returns "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }
}
