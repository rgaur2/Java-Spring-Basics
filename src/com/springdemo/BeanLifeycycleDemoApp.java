package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeycycleDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //load the configuration file 
		ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("BeanLifeCycle-applicationContext3.xml");
		
		// retrive bean from spring container 
	    Coach thecoach = context.getBean("myCoach", Coach.class);
	
	    
		// retrive bean2 from spring container 
	   // Coach alphacoach = context.getBean("myCoach", Coach.class);
	    
	    //check if they are the same bean
	    
	    System.out.println(thecoach.getDailyWorkout());
	    
	    context.close();
	}

}
