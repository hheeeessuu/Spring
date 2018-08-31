package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class AnotherBean {
	
	 @Autowired
	 @Qualifier("echo2")
	EchoBean echoBean;

	
	//EchoBean의 sayEcho 메서드 호출하는메서드
	public String say() {
		return echoBean.sayEcho();
	}

	
}
