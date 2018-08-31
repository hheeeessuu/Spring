package com.app;

public class AnotherBean {

	EchoBean echoBean;
	
	public AnotherBean(EchoBean x) {
		this.echoBean = x;
	}
	//EchoBean의 sayEcho 메서드 호출하는메서드
	public String say() {
		return echoBean.sayEcho();
	}
}
