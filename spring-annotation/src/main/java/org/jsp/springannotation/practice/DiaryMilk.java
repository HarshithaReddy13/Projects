package org.jsp.springannotation.practice;

import org.springframework.stereotype.Component;

@Component
public class DiaryMilk implements Chocolate{

	public void eat() {
		System.out.println("Eating DiaryMilk");		
	}

}
