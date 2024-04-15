package org.jsp.springannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
	@Value(value="1")
	private int id;
	private String username;
	private String password;
	@Value(value="harshi")
	public void setUsername(String username) {
		this.username = username;
	}
	public User(@Value(value="5667gdh")String Password) {
		this.password=password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
