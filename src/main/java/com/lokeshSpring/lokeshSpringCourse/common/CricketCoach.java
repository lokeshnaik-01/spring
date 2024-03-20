package com.lokeshSpring.lokeshSpringCourse.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In class constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkOut() {
        return "Practice for 10min!!";
    }
}
