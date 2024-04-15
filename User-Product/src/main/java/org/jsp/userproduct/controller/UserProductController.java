package org.jsp.userproduct.controller;

import java.util.Scanner;

import org.jsp.userproduct.MyConfig;
import org.jsp.userproduct.dao.UserProductDAO;
import org.jsp.userproduct.dto.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserProductController {
	static UserProductDAO userDao;
	static Scanner sc=new Scanner(System.in);
	static {
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		userDao=context.getBean("user",UserProductDAO.class);
	}
	public static void main(String[] args) {
		System.out.println("1.Save User");
		System.out.println("2.Update User");
		System.out.println("3.Find User By Id");
		System.out.println("4.Verify User by Phone and password");
		System.out.println("5.Verify user by email and password");
		System.out.println("6.Verify user by Id and password");
		System.out.println("7.Delete User by Id");
		System.out.println("8.Find User By name");
		System.out.println("Enter the option");
		switch(sc.nextInt()) {
		case 1:{
			save();
		}
//		case 2: {
//			update();
//			break;
//		}
//		case 3: {
//			findById();
//			break;
//		}
//		case 4: {
//			verifyByPhone();
//			break;
//		}
//		case 5: {
//			verifyByEmail();
//			break;
//		}
//		case 6: {
//			verifyById();
//			break;
//		}
//		case 7: {
//			delete();
//			break;
//		}
//		case 8: {
//			findByName();
//			break;
//		}
		default: {
			System.err.println("Invalid Choice");
		}
		}
	
	}
	public static void save() {
		System.out.println("Enter the name,phone,email,gender and password : ");
		User u=new User();
		u.setName(sc.next());
		u.setPhone(sc.nextLong());
		u.setEmail(sc.next());
		
		u.setPassword(sc.next());
		u=userDao.saveUser(u);
		System.out.println("User Saved with Id :"+u.getId());
	}
}
