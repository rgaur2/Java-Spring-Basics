package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
	
	     //create application.xml
		//Load the Spring configuation application.xml
		
	    ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from Spring container 
	    
	    Coach thecoach = context.getBean("myCoach", Coach.class);
		
		//call method on the bean
		System.out.println(thecoach.getDailyWorkout());
		
		//"Lets call the one more Method for Fortune"
		 
		System.out.println(thecoach.getDailyFortune());
		//close the context
		 
		context.close();

	}

}
