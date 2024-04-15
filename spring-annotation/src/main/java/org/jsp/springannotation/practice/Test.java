package org.jsp.springannotation.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("org.jsp.springannotation.practice");
		Baby b=context.getBean("baby",Baby.class);
		b.getCh().eat();
	}
}
