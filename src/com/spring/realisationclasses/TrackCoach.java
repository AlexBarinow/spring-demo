package com.spring.realisationclasses;

import com.spring.interfaces.Coach;
import com.spring.interfaces.FortuneService;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public TrackCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return "Track";
    }

    @Override
    public String getDailyFortune() {
      return fortuneService.getFortune();
    }

    @Override
    public String combined(){
        return getDailyFortune() + "\n" + getDailyWorkout();
    }



}