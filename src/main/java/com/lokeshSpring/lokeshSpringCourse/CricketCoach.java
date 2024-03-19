package com.lokeshSpring.lokeshSpringCourse;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkOut() {
        return "Practice for 10min!!";
    }
}
