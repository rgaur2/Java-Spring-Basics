package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //load the configuration file 
		ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("BeanScope-applicationContext2.xml");
		
		// retrive bean from spring container 
	    Coach thecoach = context.getBean("myCoach", Coach.class);
	
	    
		// retrive bean2 from spring container 
	    Coach alphacoach = context.getBean("myCoach", Coach.class);
	    
	    //check if they are the same bean
	    
	    boolean result = (thecoach==alphacoach);
	    
	    System.out.println("\n Pointing to the same object:" + result);
	    System.out.println("\n memoiry location for the coach:" + thecoach);
	    System.out.println("\n memoiry location for the coach:" + alphacoach +"\n");
	    
	    context.close();
	}

}
