package com.lokeshSpring.lokeshSpringCourse.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TennisCoach implements Coach{
    public TennisCoach() {
        System.out.println("In class constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkOut() {
        return null;
    }
}
