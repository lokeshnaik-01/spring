package com.lokeshSpring.lokeshSpringCourse.common;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach{
    public BaseBallCoach() {
        System.out.println("In class constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkOut() {
        return "batting 30min";
    }
}
