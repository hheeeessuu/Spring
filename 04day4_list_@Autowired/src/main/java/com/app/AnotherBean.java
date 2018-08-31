package com.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class AnotherBean {

	@Autowired
	List<EchoBean> list;

	public List<EchoBean> getList() {
		return list;
	}
	
	


	
}
