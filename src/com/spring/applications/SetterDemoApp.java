package com.spring;

import com.spring.interfaces.Coach;
import com.spring.realisationclasses.TrackCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public static void main(String args[]){

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("com/spring/applicationContext.xml");

         Coach theCoach = context.getBean("myTrackCoach", TrackCoach.class);

        System.out.println(theCoach.getDailyWorkout() + "\n" +
                theCoach.getDailyFortune());

        context.close();
    }
}