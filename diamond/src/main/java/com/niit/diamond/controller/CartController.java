package com.niit.diamond.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.diamondbackend.Dao.CartDao;
import com.niit.diamondbackend.Dao.OrderDao;
import com.niit.diamondbackend.Dao.ProductDao;
import com.niit.diamondbackend.Dao.UserDao;
import com.niit.diamondbackend.model.Cart;
import com.niit.diamondbackend.model.Order;
import com.niit.diamondbackend.model.Product;
import com.niit.diamondbackend.model.User;

@Controller
public class CartController
{
	@Autowired
   ProductDao pdao;
	
	@Autowired
	UserDao udao;
	
	@Autowired
	CartDao cdao;

	@Autowired
	OrderDao odao;
	
	@RequestMapping(value="/user/Cart")
  	public String userCart(Model m,@RequestParam("cmsg")String msg)
  	{
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	      String name = auth.getName();
		List<Cart> calist=cdao.getCartItems(name);
		m.addAttribute("calist",calist);
		m.addAttribute("cmsg", msg);
		return "shoppingcart";
		
  	}
  	
	@RequestMapping(value="/user/addcart")
  	public String addCart(@RequestParam("pid")int pid, @RequestParam("quantity")int qty,Model m)
  	{
		
		
		
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	      String name = auth.getName();
	      Product p=pdao.getProduct(pid);
	      
	      
	      if(p.getStock()>=qty)
	      {
	    	  
	    	  Cart c1=cdao.getCartById(pid, name);
	    	  if(c1==null)
	    	  {
	    	  Cart c=new Cart();
		      c.setCartqnty(qty);
		      c.setProduct(p);
		      c.setUser(udao.getUser(name));
		      
		      cdao.addCart(c);
		     /* p.setStock(p.getStock()-qty);
		      pdao.updateProduct(p);*/
		      m.addAttribute("cmsg", "Cart added Successfully");
	    	  }
	    	  else
	    	  {
	    		  c1.setCartqnty(c1.getCartqnty()+qty);
	    		  cdao.updateCart(c1);
	    		  m.addAttribute("cmsg", "Cart Updated Successfully");
	    	  }
		      return "redirect:/user/Cart";
		      
	    	  
	      }
	      else
	      {
	    	  if(p.getStock()==0)
	    	  {
	    	  m.addAttribute("cmsg", "NO STOCK AVAILABLE...");
	    	  }
	    	  else
	    	  {
	    		  m.addAttribute("cmsg", "Required quantity not available");
	    	  }
	    	  return "redirect:/productdetails?id="+pid;
	      }
	      
	
		
		
		
  	}
	@RequestMapping(value="/user/deletecart")
    public String deletecart(@RequestParam("id")int cartid,Model m)
    {
        Cart cart=cdao.getCartItem(cartid);
        Product p=cart.getProduct();
        p.setStock(p.getStock()+cart.getCartqnty());
        pdao.updateProduct(p);
        
        cdao.deleteCart(cart);
        Cart cart1=cdao.getCartItem(cartid);
        m.addAttribute("clist",cart1);
         
        Cart cart2=new Cart();
        m.addAttribute(cart2);
        m.addAttribute("cmsg", "Cart item deleted Successfully");
         
        return "redirect:/user/Cart";
    }
	@RequestMapping(value="/user/updatecart")
    public String updateCart(@RequestParam("cid") int cartid,@RequestParam("qty") int qty,Model m)
    {
		Cart c=cdao.getCartItem(cartid);
		
		if(c.getProduct().getStock()>=qty)
		{
		c.setCartqnty(qty);
		cdao.updateCart(c);
		m.addAttribute("cmsg", "");
		}
		else
		{
			m.addAttribute("cmsg", "Not in Stock");
		}
		
		return "redirect:/user/Cart";
    }
	
	@RequestMapping("/user/shipping")
    String shipping(Model m)
	{
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	      String name = auth.getName();
		List<Cart> calist=cdao.getCartItems(name);
		m.addAttribute("calist",calist);
		User u=udao.getUser(name);
		m.addAttribute("u",u);
		return "shipping";
	}
	@RequestMapping("/user/saveorder")
  	public ModelAndView saveorder(@RequestParam("sum")double gtot,@RequestParam("name")String name, @RequestParam("email_address")String email,@RequestParam("phone_number")String phone,@RequestParam("address")String address,@RequestParam("country")String country,@RequestParam("state")String state,@RequestParam("city")String city,@RequestParam("pincode")String pincode)
  	{
		System.out.println("TOTAL : "+gtot);
  		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String username = authentication.getName();
		
		ModelAndView mv=new ModelAndView("confirm");
		User u=udao.getUser(username);
		mv.addObject("User", u);
		Order o=new Order();

		o.setName(name);
	
		o.setAddress(address);
		o.setEmail(email);
		o.setPhone(phone);
		o.setState(state);
		o.setCity(city);
		o.setGranttotal(gtot);
		o.setPincode(pincode);
		o.setCountry(country);
		o.setUser(u);
		odao.addOrders(o);
	
		
		List<Cart> calist=cdao.getCartItems(username);
		mv.addObject("calist",calist);

		mv.addObject("Order", o);
		
		return mv;
		
	    
  	}
	@RequestMapping("/user/thanks")
    String thanks(Model m)
	{
		
		return "thanks";
	}
}
