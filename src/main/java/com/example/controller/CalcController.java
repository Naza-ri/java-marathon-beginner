package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/10km")
public class CalcController {

	@Autowired
	private HttpSession session;

	@RequestMapping("")
	public String index() {
		return "inputvalue";
	}

	@RequestMapping("/answer")
	public String answer(Integer num1, Integer num2) {
		session.setAttribute("num1", num1);
		session.setAttribute("num2", num2);
		session.setAttribute("answer", num1 * num2);
		return "outputvalue";
	}

	@RequestMapping("/outputvalue2")
	public String next() {
		return "outputvalue2";
	}
}