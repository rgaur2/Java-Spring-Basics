package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		//Load the Spring configuation File 
	    ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from Spring container 
	    CricketCoach cricketcoach = context.getBean("myCricketCoach",CricketCoach.class);
	    // call methods on bean
	    System.out.println(cricketcoach.getDailyFortune());
	    System.out.println(cricketcoach.getDailyWorkout());
	    //call our new methods to get literals values 
	    System.out.println(cricketcoach.getEmailAddress());
	    System.out.println(cricketcoach.getTeam());
	    context.close();
	}

}
