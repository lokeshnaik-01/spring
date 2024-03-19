package com.lokeshSpring.lokeshSpringCourse.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

// here we created a package called as rest controller and init we are initializing the controller
// when ever a get request is called sayHello method will be executed
/*
@RestController
public class FunRestController {
    // expose "/" that returns "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    // expose a new endpoint
    @GetMapping("/name")
    public String greetByName() {
        return "Hi Lokesh Naik";
    }

    // inject properties for: coach.name and teach.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teamInfo")
    public String getTeamInfo() {
        return "Coach: " + coachName + " Team: " + teamName;
    }

}
*/