package com.app;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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
	
	@PostConstruct
	public void aaa() {
		System.out.println("aaa");
	}
	
	@PreDestroy
	public void bbb() {
		System.out.println("bbb");
	}
}
