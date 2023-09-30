package com.dj.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dj.springcoredemo.common.Coach;

@RestController
public class DemoController {

    // define a private field for dependency
    private Coach myCoach;
    private Coach myNewCoach;

    @Autowired
    public DemoController(
            @Qualifier("foozballCoach") Coach theCoach,
            @Qualifier("foozballCoach") Coach theNewCoach) {
        this.myCoach = theCoach;
        this.myNewCoach = theNewCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return this.myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "comparing beans: myCoach & myNewCoach, " + (this.myCoach == this.myNewCoach);
    }
}
