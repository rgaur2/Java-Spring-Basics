package com.springdemo;

public class BaseballCoach  implements Coach{
	
	
	private FortuneService fortuneservice;
	// This   one is perfect Example of dependency injection 
	// Dependency injection in Constructor
	public BaseballCoach(FortuneService thefortuneservice )
	{
		fortuneservice = thefortuneservice;
	}

	@Override 
	public String getDailyWorkout()
	{
		
		return "Spend 30 min in daily batting Practice ";
	}

	@Override
	public String getDailyFortune() {
		//use fortune service to get Fortune
		
		return fortuneservice.getFortune();
	}
}
