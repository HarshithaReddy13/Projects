package org.jsp.springannotation.practice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value="icici")
@Primary
public class ICICI implements BankAccount{


	public double getBalance() {
		return 188780;
	}
	
}
