package org.jsp.springannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OpenPhonePe {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("org.jsp.springannotation");
		PhonePe p=context.getBean("phonepe",PhonePe.class);
		p.open();
	}
}
