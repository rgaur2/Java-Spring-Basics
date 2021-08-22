package com.springdemo;

public class TrackCoach implements Coach {

	public TrackCoach()
	{
		
	}
	
	private FortuneService fortuneservice;


	public TrackCoach(FortuneService fortuneservice) {
		
		this.fortuneservice = fortuneservice;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "just do it" + fortuneservice.getFortune();
	}
	
	public void doMyStartupStuff()
	{
		System.out.println("Track coach inside method do my startup");
	}
	
	public void domycleanupStuff()
	{
		System.out.println("Track coach inside method do my cleanup");
	}
}
