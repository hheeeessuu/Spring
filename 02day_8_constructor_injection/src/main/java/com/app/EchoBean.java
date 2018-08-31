package com.app;

public class EchoBean {

	String mesg;
	
	//constructor injection
	public EchoBean(String x) {
		this.mesg = x;
	}
	
	public EchoBean() {
		System.out.println("EchoBean 생성자");
	}

	public String sayEcho() {
		return "안녕하세요" + mesg;
	}
}
