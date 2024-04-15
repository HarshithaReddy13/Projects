package org.jsp.springannotation.practice;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{

	public void start() {
		System.out.println("Bike started");
		
	}
	
}
