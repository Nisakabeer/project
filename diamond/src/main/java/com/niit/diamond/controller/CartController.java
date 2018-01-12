package com.niit.diamond.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CartController
{

	@RequestMapping(value="/shoppingcart")
  	public String addCart(@RequestParam("pid")int pid, @RequestParam("quantity")int qty,Model m)
  	{
		m.addAttribute("pid", pid);
		m.addAttribute("qty", qty);
		
		return "shoppingcart";
		
  	}
}
