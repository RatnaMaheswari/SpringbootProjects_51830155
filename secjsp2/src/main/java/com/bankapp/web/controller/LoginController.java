package com.bankapp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	@GetMapping(path="accessdenied")
	public String accessdenied(){
		return "403";
	}
	
	@GetMapping(path="mylogin")
	public String login(){
		return "loginpage";
	}
	@GetMapping(path="/")
	public String index(){
		return "redirect:/home";
	}
	
	@GetMapping(path="home")
	public String hello(){
		return "home";
	}
}






