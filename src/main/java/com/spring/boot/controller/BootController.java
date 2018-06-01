package com.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BootController {
	
	@RequestMapping(value="/")
	public String index(){
		return "index";
	}
	
	@RequestMapping(value="/login")
	public String login(){
		return "login";
	}

}
