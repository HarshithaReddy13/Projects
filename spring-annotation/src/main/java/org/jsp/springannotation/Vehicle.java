package org.jsp.springannotation;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {
	public void start() {
		System.out.println("Ride started");
	}
}
