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

    @Autowired
    public DemoController(@Qualifier("foozballCoach") Coach theCoach) {
        this.myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return this.myCoach.getDailyWorkout();
    }
}
