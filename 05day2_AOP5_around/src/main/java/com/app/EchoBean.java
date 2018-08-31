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
//		int n = 10/0;
		return "안녕하세요" + mesg;
	}
	
	public String kkk() {
		System.out.println("kkk");
		return "가세요" + mesg;
	}
}
