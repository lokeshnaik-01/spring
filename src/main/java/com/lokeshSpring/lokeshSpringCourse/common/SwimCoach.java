package com.lokeshSpring.lokeshSpringCourse.common;

public class SwimCoach implements Coach{
    public SwimCoach() {
        System.out.println("In constructor swim");
    }
    @Override
    public String getDailyWorkOut() {
        return "Swim 100min";
    }
}
