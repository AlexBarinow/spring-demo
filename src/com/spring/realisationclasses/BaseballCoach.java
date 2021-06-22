package com.spring.realisationclasses;

import com.spring.interfaces.Coach;
import com.spring.interfaces.FortuneService;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "BaseballCoach";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String combined() {
        return null;
    }

    public String getEmailAddress() {

        return "oleksii.havriuk@betbull.com";
    }

    public String getTeam() {

        return "Base Ball team with no name";
    }




}