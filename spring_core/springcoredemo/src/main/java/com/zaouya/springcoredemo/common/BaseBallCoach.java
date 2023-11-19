package com.zaouya.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach{


    @PostConstruct
    public void doMyStartupStaff () {
        System.out.println("In doMyStartupStaff : " + getClass().getSimpleName());
    }

    @PreDestroy
    public void doMyCleanupStaff () {
        System.out.println("In doMyCleanupStaff : " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return ("Hi BaseBall Coach was Saluting You hello Mother Fucker  :):>");
    }
}
