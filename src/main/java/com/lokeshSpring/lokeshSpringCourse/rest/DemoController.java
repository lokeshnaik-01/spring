package com.lokeshSpring.lokeshSpringCourse.rest;


import com.lokeshSpring.lokeshSpringCourse.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // define a private field for dependency
    private Coach myCoach;
    private Coach anotherCoach;
    /*
    // define a constructor for dependency injection
    @Autowired
    public DemoController(Coach theCoach) {
        myCoach = theCoach;
    }
    */

    // setter method for dependency injection
    // we can also use method name as doSetCoach as spring doesn't care for method name and just check it is Autowired

    /*
    @Autowired
    public void setCoach(Coach theCoach) {
        myCoach = theCoach;
    }
    */

    /*
    @Autowired
    // we set track as primary, so it'll be picked and no need to mention qualifier
    public DemoController(Coach theCoach) {
        myCoach = theCoach;
    }
    */

    @Autowired
    // we are specifying to use this implementation of coach interface
    public DemoController(
            @Qualifier("cricketCoach") Coach theCoach,
            @Qualifier("cricketCoach") Coach theAnotherCoach) {
        System.out.println("In class constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkOut();
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
    }
}
