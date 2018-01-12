package com.niit.diamond.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.niit.diamondbackend.Dao.SupplierDao;
import com.niit.diamondbackend.model.Category;
import com.niit.diamondbackend.model.Supplier;

@Controller
public class SupplierController 
{
	@Autowired
	  SupplierDao sdao;
	  
	  @RequestMapping(value="/admin/saveSupplier")
	  ModelAndView savesupplier(@RequestParam("SupName")String SupName,@RequestParam("SupAddress")String SupAddress)
	  {
		  Supplier s=new Supplier();
		  s.setSname(SupName);
		  s.setSaddress(SupAddress);
		   sdao.saveSupplier(s);
		     
			ModelAndView mv=new ModelAndView("redirect:/admin");
			
			return mv;
}
	  @RequestMapping(value="/admin/deleteSup")
	  ModelAndView deletecategory(@RequestParam("id")int sid)
	  {
		  Supplier s=sdao.getSupplier(sid);
		   sdao.deletSupplier(s);
			
			ModelAndView mv=new ModelAndView("redirect:/admin");
			return mv;
	  }
	  @RequestMapping(value="/admin/editSup")
	  ModelAndView editcategory(@RequestParam("id")int sid)
	  {
		  Supplier s=sdao.getSupplier(sid);
		  
		   
			
			ModelAndView mv=new ModelAndView("editsupplier");
			mv.addObject("s",s);
			return mv;
	  }
	  
	  @RequestMapping(value="/admin/updateSupplier")
	  ModelAndView updatesupplier(@RequestParam("id")int id,@RequestParam("SupName")String SupName,@RequestParam("SupAddress")String SupAddress)
	  {
		  Supplier s=sdao.getSupplier(id);
		  s.setSname(SupName);
		  s.setSaddress(SupAddress);
		   sdao.updateSupplier(s);
		     
			ModelAndView mv=new ModelAndView("redirect:/admin");
			
			return mv;
}

}