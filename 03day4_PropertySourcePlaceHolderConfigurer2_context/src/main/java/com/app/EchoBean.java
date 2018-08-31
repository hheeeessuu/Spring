package com.app;

public class EchoBean {

	String mesg;
	
    public void setMesg(String m) {
    	this.mesg = m;
    }

	public String sayEcho() {
		return "안녕하세요" + mesg;
	}
}
