package com.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.Userform;

@Controller
@RequestMapping("/5km")
public class UserInfoServlet {
	
	@ModelAttribute
	public Userform setUpform() {
		return new Userform();
	}
	
	@RequestMapping("")
	public String index() {
		return "inputuserinfo";
	}
	
	@RequestMapping("/outputinfo")
	public String outputinfo(Userform userForm,Model model) {
		User user =new User();
		user.setName(userForm.getName());
		user.setAge(userForm.getAge());
		user.setAddress( userForm.getAddress());
		model.addAttribute("user", user);
		return "outputuserinfo";
	}
}
