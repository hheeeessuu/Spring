package com.app;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

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
	
	@PostConstruct
	public void aaa() {
		System.out.println("aaa");
	}
	
	@PreDestroy
	public void bbb() {
		System.out.println("bbb");
	}
	
	public void xxx() {
		System.out.println("init-method : xxx");
	}
	
	public void yyy() {
		System.out.println("destroy-method : yyy");
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
