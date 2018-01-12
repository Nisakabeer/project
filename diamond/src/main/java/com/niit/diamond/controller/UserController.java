package com.niit.diamond.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.diamondbackend.Dao.UserDao;
import com.niit.diamondbackend.model.User;

@Controller
public class UserController
{
	@Autowired
	UserDao udao;
	
	@RequestMapping(value="/saveUser")
	ModelAndView saveuser(@RequestParam("name")String name,@RequestParam("address")String address,@RequestParam("contactno")long contactno,@RequestParam("email")String email,@RequestParam("password")String password)
	{
		
		User u=new User();
		u.setAddress(address);
		u.setName(name);
		u.setPhoneno(contactno);
		u.setMail(email);
		u.setPassword(password);
		u.setRole("USER_ROLE");
		
		udao.saveUser(u);
		
		ModelAndView mv=new ModelAndView("redirect:/login");
		return mv;
	}

}
