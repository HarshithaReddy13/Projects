package org.jsp.springannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCar {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.register(Car.class);
		context.refresh();
		Car c=context.getBean(Car.class);
		c.start();
	}
}
