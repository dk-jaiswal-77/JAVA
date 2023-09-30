package com.dj.springboot.practice.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // injecting properties
    @Value("${team.name}")
    public String teamName;

    @Value("${coach.name}")
    public String coachName;
    // expose '/' that returns "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "team: " + this.teamName + "coach: " + this.coachName;
    }

    // expose a new endpoint '/workout'
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 3K!";
    }

    // expose a new endpoint '/fortune'
    @GetMapping("/fortune")
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
