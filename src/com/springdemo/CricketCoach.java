package com.springdemo;

public class CricketCoach implements Coach {

	//bean
	
	private FortuneService fortuneservice;
	private String emailAddress;
	private String team ;
	
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		System.out.println("CricketCoach :inside setter method - setTeam");
		this.team = team;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		
		System.out.println("CricketCoach :inside setter method - setEmail");
		this.emailAddress = emailAddress;
	}
	// create a no argument constructor
	
	public CricketCoach()
	{
		System.out.println("Cricket coach inside no -arg Constructor");
	}
	// our setter method
	// best example of dependency injection by setter injection
	
	public void setFortuneservice(FortuneService fortuneservice) {
		System.out.println("CricketCoach :inside setter method - set Fortune service");
		this.fortuneservice = fortuneservice;
	}
	@Override
	public String getDailyWorkout() {
		
		return "Practice fast Bowling for 15 min";
	}

	@Override
	public String getDailyFortune() {
		return fortuneservice.getFortune() ;
	}

}
