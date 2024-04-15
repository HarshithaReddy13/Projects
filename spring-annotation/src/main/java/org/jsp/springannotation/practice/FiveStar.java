package org.jsp.springannotation.practice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FiveStar implements Chocolate{

	
	public void eat() {
		System.out.println("Eating 5 stra doing nothing");
		
	}
	
}
