package org.jsp.springannotation.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestRide {
	public static void main(String[] args) {
		
	
	ApplicationContext context=new AnnotationConfigApplicationContext("org.jsp.springannotation.practice");
	Ride r=context.getBean("ride",Ride.class);
	r.getV().start();
	}
}
