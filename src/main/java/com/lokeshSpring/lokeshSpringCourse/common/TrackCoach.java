package com.lokeshSpring.lokeshSpringCourse.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

    @Override
    public String getDailyWorkOut() {
        return "Run 5k";
    }
}
