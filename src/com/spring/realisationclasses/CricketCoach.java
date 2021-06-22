package com.spring.realisationclasses;

import com.spring.interfaces.Coach;
import com.spring.interfaces.FortuneService;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    public  CricketCoach(){
        // System.out.println("what's going on behind the scenes");
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    private String emailAddress;

    public String getTeam() {
        return team;
    }

    private String team;

    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team){
        this.team = team;
    }



    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "let's go play a  cricket!!!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String combined() {
        return null;
    }
}
