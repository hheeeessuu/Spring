package com.app;

// target object
public class EchoBean {

	String mesg;
	
    public void setMesg(String m) {
    	this.mesg = m;
    }

    // 핵심기능 핵시 메서드
	public String sayEcho() {
		System.out.println("sayEcho");
		return "안녕하세요" + mesg;
	}
	
	public void sayEcho2() {
		System.out.println("sayEcho2");
	}
	
	public void aaa() {
		System.out.println("aaa");
	}
}
