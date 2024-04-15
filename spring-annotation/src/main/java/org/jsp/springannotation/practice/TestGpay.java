package org.jsp.springannotation.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestGpay {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("org.jsp.springannotation.practice");
		Gpay gpay=context.getBean("gpay",Gpay.class);
		System.out.println(gpay.getB().getBalance());
	}
}
