package com.niit.diamond.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.diamondbackend.Dao.CategoryDao;
import com.niit.diamondbackend.model.Category;
import com.niit.diamondbackend.model.Supplier;

@Controller
public class CategoryController
{
  @Autowired
  CategoryDao cdao;
  
  @RequestMapping(value="/admin/saveCategory")
  ModelAndView savecategory(@RequestParam("catname")String catname,@RequestParam("catdescription")String catdescription)
  {
	  Category c=new Category();
	   c.setCname(catname);
	   c.setCdescription(catdescription);
	   cdao.saveCategory(c);
		
		ModelAndView mv=new ModelAndView("redirect:/admin");
		return mv;
  }
  @RequestMapping(value="/admin/deleteCat")
  ModelAndView deletecategory(@RequestParam("id")int cid)
  {
	  Category c=cdao.getCategory(cid);
	   cdao.deleteCategory(c);
		
		ModelAndView mv=new ModelAndView("redirect:/admin");
		return mv;
  }
  @RequestMapping(value="/admin/editCat")
  ModelAndView editcategory(@RequestParam("id")int cid)
  {
	  Category c=cdao.getCategory(cid);
	  
	 
		
		ModelAndView mv=new ModelAndView("editcategory");
		
		mv.addObject("c",c);
		return mv;
  }
  @RequestMapping(value="/admin/updateCategory")
  ModelAndView upcategory(@RequestParam("id")int id,@RequestParam("catname")String catname,@RequestParam("catdescription")String catdescription)
  {
	  Category c=cdao.getCategory(id);
	   c.setCname(catname);
	   c.setCdescription(catdescription);
	   cdao.updateCategory(c);
		
		ModelAndView mv=new ModelAndView("redirect:/admin");
		return mv;
  }
 
}