package com.app;

public class EchoBean {

	String mesg;
	int age;
	
	//constructor injection
	public EchoBean(String x,int a) {
		this.mesg = x;
		this.age = a;
	}
	
	public EchoBean(String x) {
		this.mesg = x;
	}
	
	public EchoBean() {
		System.out.println("EchoBean 생성자");
	}

	public String sayEcho() {
		return "안녕하세요" + mesg +"\t" + age;
	}
}
