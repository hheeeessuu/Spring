package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //1.
public class TestController {	
	// http://localhost:8090/app/xyz
	@RequestMapping("/xyz") //3. /가 꼭 들어가야 한다.
	//2. return타입이 String인 메소드를 만든다.
	public String aaa() {
		System.out.println("aaa");
		return "/WEB-INF/views/hello.jsp";	// View 설정 ( jsp )
	}

	// http://localhost:8090/app/bbb
	@RequestMapping("/bbb")
	public String bbb() {
		System.out.println("bbb");
		return "/WEB-INF/views/hello.jsp";
	}
}