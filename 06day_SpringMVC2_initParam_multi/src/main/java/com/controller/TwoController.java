package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TwoController {
	@RequestMapping("/bbb")
	public String xxx() {
		return "/WEB-INF/views/two.jsp";
	}
}
