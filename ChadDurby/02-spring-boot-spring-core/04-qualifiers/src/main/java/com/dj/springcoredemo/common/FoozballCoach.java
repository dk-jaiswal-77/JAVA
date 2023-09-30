package com.dj.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class FoozballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "practice foozball for 20 minutes!";
    }
}
