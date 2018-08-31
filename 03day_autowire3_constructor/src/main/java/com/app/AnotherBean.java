package com.app;

public class AnotherBean {

	EchoBean echoBean;
	
    public AnotherBean() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    // 1개: 변수명 무시하고 injection
    // 2개: 변수가 모두 다르면 injection 안됨.
    // 2개: 일치하는 변수가 있으면 injection 됨.
	public AnotherBean(EchoBean echoBean) {
		super();
		this.echoBean = echoBean;
	}

	//sette injection
	public void setEchoBean(EchoBean echoBean) {
		this.echoBean = echoBean;
	}
	
	//EchoBean의 sayEcho 메서드 호출하는메서드
	public String say() {
		return echoBean.sayEcho();
	}

	
}
