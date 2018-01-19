package com.niit.diamond.controller;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.niit.diamondbackend.Dao.CategoryDao;
import com.niit.diamondbackend.Dao.ProductDao;
import com.niit.diamondbackend.Dao.SupplierDao;
import com.niit.diamondbackend.model.Category;
import com.niit.diamondbackend.model.Product;
import com.niit.diamondbackend.model.Supplier;

@Controller
public class ProductController 
{
	 @Autowired
	  ProductDao pdao;
	 @Autowired
	  CategoryDao cdao;
	 @Autowired
	  SupplierDao sdao;
	 @RequestMapping(value="/admin/saveProduct")
	  ModelAndView saveproduct(@RequestParam("productname")String productname,@RequestParam("productDescription")String productDescription,@RequestParam("quantity")int quantity,@RequestParam("price")double price,@RequestParam("cid")int cid,@RequestParam("sid")int sid,@RequestParam("img") MultipartFile file)
	  {
		  Product p=new Product();
		  p.setPname(productname);
		  p.setDescription(productDescription);
		  p.setStock(quantity);
		  p.setPrice(price);
		  p.setCategory(cdao.getCategory(cid));
		  p.setSupplier(sdao.getSupplier(sid));
	
		   pdao.saveProduct(p);
		   
		   String filepath ="E:/niitproject/diamond/src/main/webapp/resources/images/"+p.getPid()+".jpg";
			
			System.out.println(filepath);
			try {
				byte imagebyte[] = file.getBytes();
				BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(filepath));
				fos.write(imagebyte);
				fos.close();
				} catch (IOException e) {
				e.printStackTrace();
				} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			
			ModelAndView mv=new ModelAndView("redirect:/admin");
			return mv;
			
	  }
	 
	
	 @RequestMapping(value="/admin/deleteprod")
	  ModelAndView deleteproduct(@RequestParam("id")int pid)
	  {
		  Product p=pdao.getProduct(pid);
		   pdao.deletProdudct(p);
			ModelAndView mv=new ModelAndView("redirect:/admin");
			return mv;
	  }
	 @RequestMapping(value="/admin/editprod")
	  ModelAndView editproduct(@RequestParam("id")int pid)
	  {
		  Product p=pdao.getProduct(pid);
		  
		   
			
			ModelAndView mv=new ModelAndView("editproduct");
			 List<Supplier> slist=sdao.getSuppliers();
			   System.out.println(slist);
			mv.addObject("slist", slist);
			List<Category> clist=cdao.getCategorys();
			   System.out.println(clist);
			mv.addObject("clist", clist);
			mv.addObject("p",p);
			return mv;
	  }
	 
	 
	
	 @RequestMapping(value="/productdetails")
	 String productdet(@RequestParam("id")int id,@RequestParam("cmsg")String msg,Model m)
	 {
		 
		 Product p=pdao.getProduct(id);
	     m.addAttribute("p",p);
	     m.addAttribute("cmsg", msg);
	     return "productdetails";
	 	

			
	     
	 } 
	
	 @RequestMapping(value="/admin/updateProduct")
	  ModelAndView updateproduct(@RequestParam("id")int id,@RequestParam("productname")String productname,@RequestParam("productDescription")String productDescription,@RequestParam("quantity")int quantity,@RequestParam("price")double price,@RequestParam("cid")int cid,@RequestParam("sid")int sid,@RequestParam("img") MultipartFile file)
	  {
		 Product p=pdao.getProduct(id);
		  p.setPname(productname);
		  p.setDescription(productDescription);
		  p.setStock(quantity);
		  p.setPrice(price);
		  p.setCategory(cdao.getCategory(cid));
		  p.setSupplier(sdao.getSupplier(sid));
	
		  pdao.updateProduct(p);
		   
		   String filepath ="E:/niitproject/diamond/src/main/webapp/resources/images/"+p.getPid()+".jpg";
			
			System.out.println(filepath);
			try {
				byte imagebyte[] = file.getBytes();
				BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(filepath));
				fos.write(imagebyte);
				fos.close();
				} catch (IOException e) {
				e.printStackTrace();
				} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			
			ModelAndView mv=new ModelAndView("redirect:/admin");
			return mv;
			
	  }
	 
}
