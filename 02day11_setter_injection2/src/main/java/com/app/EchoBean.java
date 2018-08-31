package com.app;

public class EchoBean {

	String mesg;
	int age;

    public void setAge(int age) {
		this.age = age;
	}

	public void setMesg(String m) {
    	this.mesg = m;
    }

	public String sayEcho() {
		return "안녕하세요" + mesg +"\t" + age;
	}
}
