package com.lokeshSpring.lokeshSpringCourse.common;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach{
    @Override
    public String getDailyWorkOut() {
        return "batting 30min";
    }
}
