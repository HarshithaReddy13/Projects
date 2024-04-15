package org.jsp.springannotation.practice;

import org.springframework.stereotype.Component;

@Component
public class Bus implements Vehicle{

	public void start() {
		System.out.println("Bus started");
		
	}
	
}
