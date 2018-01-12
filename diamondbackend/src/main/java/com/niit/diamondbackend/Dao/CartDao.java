package com.niit.diamondbackend.Dao;

import java.util.List;

import com.niit.diamondbackend.model.Cart;

public interface CartDao 
{
	void addCart(Cart ct);
	void updateCart(Cart ct);
	void deleteCart(Cart ct);
	Cart getCartItem(int cartid); 
	public Cart getCartById(int pid,String mail);
	List<Cart> getCartItems(String username);
}
