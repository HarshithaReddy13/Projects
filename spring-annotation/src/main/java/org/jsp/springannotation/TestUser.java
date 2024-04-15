package org.jsp.springannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUser {
	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext("org.jsp.springannotation");
		User user=context.getBean("user",User.class);
		System.out.println("User Id : "+user.getId());
		System.out.println(("User Name: "+user.getUsername()));
		System.out.println("password:"+user.getPassword());
	}
}
