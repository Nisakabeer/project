package com.niit.diamond.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.diamondbackend.Dao.CategoryDao;
import com.niit.diamondbackend.Dao.ProductDao;
import com.niit.diamondbackend.Dao.SupplierDao;
import com.niit.diamondbackend.model.Category;
import com.niit.diamondbackend.model.Product;
import com.niit.diamondbackend.model.Supplier;

@Controller
public class IndexController
{
	@Autowired
	 SupplierDao sdao;
	@Autowired
	CategoryDao cdao;
	@Autowired
	ProductDao pdao;
	@RequestMapping("/")
    String index(Model m)
	{
		List<Category> clist=cdao.getCategorys();
		   System.out.println(clist);
		m.addAttribute("clist", clist);
		return "index";
	}
	@RequestMapping("/admin")
    String admin(Model m)
	{
		 List<Supplier> slist=sdao.getSuppliers();
		   System.out.println(slist);
		m.addAttribute("slist", slist);
		List<Category> clist=cdao.getCategorys();
		   System.out.println(clist);
		m.addAttribute("clist", clist);
		List<Product> plist=pdao.getProducts();
		   System.out.println(plist);
		m.addAttribute("plist", plist);
		return "admin";
	}

	 @RequestMapping(value="/productBycat")
	 ModelAndView productbycat(@RequestParam("id") int cid,Model m)
	 {
	 	
	 	

	 	m.addAttribute("clist",cdao.getCategorys());
	 	List<Product> plist=pdao.retrieveProductByCat(cid);
	     m.addAttribute("plist",plist);

			ModelAndView mv=new ModelAndView("productBycat");
			return mv;
	     
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
	
	
}
