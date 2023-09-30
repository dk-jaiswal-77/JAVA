package com.dj.springboot.practice.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // expose '/' that returns "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
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
