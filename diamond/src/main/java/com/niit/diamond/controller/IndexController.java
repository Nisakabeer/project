package com.niit.diamond.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController
{
	@RequestMapping("/")
    String index(Model m)
	{
		m.addAttribute("msg", "Hai.......Nissa.....");
		return "index";
	}
	@RequestMapping("/admin")
    String admin()
	{
		
		return "admin";
	}


	@RequestMapping("/login")
    String login()
	{
		
		return "login";
	}


	@RequestMapping("/register")
    String register()
	{
		
		return "register";
	}
	
	@RequestMapping("/ring")
    String ring()
	{
		
		return "ring";
	}
	
	@RequestMapping("/shoppingcart")
    String shoppingcart()
	{
		
		return "shoppingcart";
	}

}
