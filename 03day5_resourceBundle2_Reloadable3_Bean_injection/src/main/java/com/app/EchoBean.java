package com.app;

import java.util.Locale;

import org.springframework.context.MessageSource;

public class EchoBean {

	String mesg;
	
	MessageSource messageSource;

    public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
    
    public String sayEcho() {
		String xxx = messageSource.getMessage("greet", null, Locale.KOREA);
		return xxx + mesg;
	}

	public void setMesg(String m) {
    	this.mesg = m;
    }
}
