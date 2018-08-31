package com.app;

public class EchoBean {

	String mesg;
	int age;

	public EchoBean(int age) {
		super();
		this.age = age;
	}

	public void setMesg(String m) {
    	this.mesg = m;
    }

	public String sayEcho() {
		return "안녕하세요" + mesg +"\t" + age;
	}
}
