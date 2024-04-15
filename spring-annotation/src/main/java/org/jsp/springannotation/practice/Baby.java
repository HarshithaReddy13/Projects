package org.jsp.springannotation.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Baby {
	@Autowired
	@Qualifier(value="diaryMilk")
	private Chocolate ch;

	public Chocolate getCh() {
		return ch;
	}

	public void setCh(Chocolate ch) {
		this.ch = ch;
	}
}
