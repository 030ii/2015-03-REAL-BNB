package com.babydear.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {

	@RequestMapping("/")
	public String mainpage() {
		return "landing1.html";
	}
	@RequestMapping("/home")
	public String home() {
		return "main.html";
	}
	@RequestMapping("/exit")
	public String logout() {
		return "logout.html";
	}

	@RequestMapping("/user")
	public String user() {
		return "userPage.html";
	}
	
//	@RequestMapping("/card/{linkUrl}")
//	public String card(){
	@RequestMapping("/card/{linkUrl}")
	public String card(@PathVariable("linkUrl") String linkUrl){
		System.out.println(linkUrl);
		return "/card-share.html";
	}
}
