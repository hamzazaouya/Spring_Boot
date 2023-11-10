package com.zaouya.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;

    @Autowired
    public DemoController (Coach theCoach) {
        this.myCoach = theCoach;
    }

    @GetMapping("/workout")
    public String getWorkout () {
        return myCoach.getDailyWorkout();
    }
}
