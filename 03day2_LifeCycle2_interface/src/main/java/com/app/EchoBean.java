package com.app;

import org.springframework.beans.factory.InitializingBean;

import org.springframework.beans.factory.DisposableBean;

public class EchoBean implements InitializingBean, DisposableBean{

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
	
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterPropertiesSet 생성자");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy 생성자");
	}
}
