package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OneController {
	@RequestMapping("/aaa")
	public String xxx() {
		return "/WEB-INF/views/one.jsp";
	}
}
