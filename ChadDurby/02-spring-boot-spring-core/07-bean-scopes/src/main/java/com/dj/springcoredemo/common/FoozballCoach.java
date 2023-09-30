package com.dj.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class FoozballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "practice foozball for 20 minutes!";
    }
}
