package org.jsp.springannotation.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Gpay {
	@Autowired
	@Qualifier(value="sbi")
	private BankAccount b;

	public BankAccount getB() {
		return b;
	}

	public void setB(BankAccount b) {
		this.b = b;
	}
}
