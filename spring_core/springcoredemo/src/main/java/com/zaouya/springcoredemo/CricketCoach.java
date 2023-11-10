package com.zaouya.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return ("Hi Cricket Coach was Saluting You :):>");
    }
}
