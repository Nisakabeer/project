package com.niit.diamond.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.diamondbackend.Dao.CategoryDao;
import com.niit.diamondbackend.model.Category;

@Controller
public class CategoryController
{
  @Autowired
  CategoryDao cdao;
  
  @RequestMapping(value="/saveCategory")
  ModelAndView savecategory(@RequestParam("catname")String catname,@RequestParam("catdescription")String catdescription)
  {
	  Category c=new Category();
	   c.setCname(catname);
	   c.setCdescription(catdescription);
	   cdao.saveCategory(c);
		
		ModelAndView mv=new ModelAndView("redirect:/admin");
		return mv;
  }
}
