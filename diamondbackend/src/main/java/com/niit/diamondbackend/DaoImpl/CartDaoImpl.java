package com.niit.diamondbackend.DaoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.diamondbackend.Dao.CartDao;
import com.niit.diamondbackend.model.Cart;



@Repository
@EnableTransactionManagement
public class CartDaoImpl implements CartDao
{

	public CartDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CartDaoImpl(SessionFactory sf) {
		super();
		this.sf = sf;
	}

	@Autowired
    SessionFactory sf;

	public void addCart(Cart ct) {
		// TODO Auto-generated method stub
		
	}

	public void updateCart(Cart ct) {
		// TODO Auto-generated method stub
		
	}

	public void deleteCart(Cart ct) {
		// TODO Auto-generated method stub
		
	}

	public Cart getCartItem(int cartid) {
		// TODO Auto-generated method stub
		return null;
	}

	public Cart getCartById(int pid, String mail) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Cart> getCartItems(String username) {
		// TODO Auto-generated method stub
		return null;
	}
}

