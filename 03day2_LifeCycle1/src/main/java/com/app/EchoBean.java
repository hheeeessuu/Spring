package com.app;

public class EchoBean {

	String mesg;
	
    public void setMesg(String m) {
    	this.mesg = m;
    }
    
    public EchoBean() {
    	System.out.println("EchoBean 생성자");
    }
    
	public String sayEcho() {
		return "안녕하세요" + mesg;
	}
	
	public void xxx() {
		System.out.println("init-method : xxx");
	}
	
	public void yyy() {
		System.out.println("destroy-method : yyy");
	}
}
