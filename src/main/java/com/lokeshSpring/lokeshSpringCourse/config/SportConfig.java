package com.lokeshSpring.lokeshSpringCourse.config;

import com.lokeshSpring.lokeshSpringCourse.common.Coach;
import com.lokeshSpring.lokeshSpringCourse.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("acquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
