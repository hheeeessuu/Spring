package com.app;

import org.springframework.beans.factory.annotation.Value;

public class EchoBean {

	@Value("#{xxx.username}")
	public String username;
	
	@Value("#{xxx.age}")
	public int age;
	

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
