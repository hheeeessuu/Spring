package com.app;

import javax.annotation.Resource;

public class AnotherBean {

	@Resource(name="echo2")	// <bean id="echo">
	EchoBean echoBean;

	//EchoBean의 sayEcho 메서드 호출하는메서드
	public String say() {
		return echoBean.sayEcho();
	}
}
