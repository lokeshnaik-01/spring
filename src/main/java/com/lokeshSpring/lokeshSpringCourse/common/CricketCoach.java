package com.lokeshSpring.lokeshSpringCourse.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In class constructor: " + getClass().getSimpleName());
    }

    // define init method
    @PostConstruct
    public void doStartUpStuff() {
        System.out.println("In do StartUp: " + getClass().getSimpleName());
    }

    // define destroy method
    @PreDestroy
    public void doCleanupStuff() {
        System.out.println("In do CleanUp: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkOut() {
        return "Practice for 10min!!";
    }
}
