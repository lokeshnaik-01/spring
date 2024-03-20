package com.lokeshSpring.lokeshSpringCourse.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TrackCoach implements Coach{

    @Override
    public String getDailyWorkOut() {
        return "Run 5k";
    }
}
