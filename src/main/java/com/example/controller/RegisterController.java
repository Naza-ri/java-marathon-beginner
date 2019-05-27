package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/15km")
public class RegisterController {
	
	@Autowired
	private ServletContext application;
	
	@RequestMapping("")
	public String index() {
		return "buygoods";
	}
	
	@RequestMapping("/total")
	public String totalprice(Integer num1,Integer num2,Integer num3) {
		application.setAttribute("taxfree", num1+num2+num3);
		application.setAttribute("tax",(int)((num1+num2+num3)*1.08));
		return "totalprice";
	}
	
	
}
