package com.niit.shoppingcart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	

	@RequestMapping("/")
	public String showindexpage()
	{
		return "index";
	}

	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}

	
	
}
