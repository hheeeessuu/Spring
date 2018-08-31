package com.app;

import org.springframework.beans.factory.annotation.Required;

public class AnotherBean {

	EchoBean echoBean;
	
    @Required
	public void setEchoBean(EchoBean echoBean) {
		this.echoBean = echoBean;
	}
	
	//EchoBean의 sayEcho 메서드 호출하는메서드
	public String say() {
		return echoBean.sayEcho();
	}

	
}
