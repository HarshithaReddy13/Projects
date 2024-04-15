package org.jsp.springannotation.practice;

import org.springframework.stereotype.Component;

@Component(value="sbi")
public class SBI implements BankAccount{

	
	public double getBalance() {
		
		return 1000;
	}

}
