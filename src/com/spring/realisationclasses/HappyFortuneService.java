package com.spring.realisationclasses;

import com.spring.interfaces.FortuneService;

public class HappyFortuneService implements FortuneService {



    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }

    @Override
    public void HappyFortuneService() {
        System.out.println("here the obj of HappyFortuneService was created");
    }
}
 