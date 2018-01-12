package com.niit.diamond.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.niit.diamondbackend.Dao.SupplierDao;
import com.niit.diamondbackend.model.Supplier;

@Controller
public class SupplierController 
{
	@Autowired
	  SupplierDao sdao;
	  
	  @RequestMapping(value="/saveSupplier")
	  ModelAndView savesupplier(@RequestParam("SupName")String SupName,@RequestParam("SupAddress")String SupAddress)
	  {
		  Supplier s=new Supplier();
		  s.setSname(SupName);
		  s.setSaddress(SupAddress);
		   sdao.saveSupplier(s);
		   
		   List<Supplier> slist=sdao.getSuppliers();
		   System.out.println(slist);
			
			ModelAndView mv=new ModelAndView("redirect:/admin");
			return mv;
}

}