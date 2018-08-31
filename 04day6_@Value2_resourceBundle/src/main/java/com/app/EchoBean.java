package com.app;

import org.springframework.beans.factory.annotation.Value;

public class EchoBean {

	@Value("${value.name}")
	String username;
	
	@Value("${value.age}")
	int age;
	

	public void setUsername(String username) {
		this.username = username;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String sayEcho() {
		return "안녕하세요" + username + "\t" + age;
	}
}
