package com.niit.diamondbackend.DaoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
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
		Session session=sf.openSession();
		session.beginTransaction();
		session.persist(ct);
		session.getTransaction().commit();
		
	}

	public void updateCart(Cart ct) {
		Session session=sf.openSession();
		session.beginTransaction();
		session.update(ct);
		session.getTransaction().commit();
		
	}

	public void deleteCart(Cart ct) {
		Session session=sf.openSession();
		session.beginTransaction();
		session.delete(ct);
		session.getTransaction().commit();
		
	}

	public Cart getCartItem(int cartid) {
		Session session=sf.openSession();
        Cart cart=(Cart)session.get(Cart.class, cartid);
        session.close();
        return cart;
	}

	public Cart getCartById(int pid, String mail) {
		Session session=sf.openSession();
		Cart cart=null;
		try
		{
			System.out.println("===========Product existence============="+cart);
			session.beginTransaction();
			cart=(Cart)session.createQuery("From Cart where USERMAILID =:mail and PRODUCT_ID=:id")
					        .setString("mail",mail)
					        .setInteger("id", pid)
					        .uniqueResult();
			session.getTransaction().commit();
			System.out.println("Cart: "+cart);
			return cart;
		}
		catch(HibernateException e)
		{
			System.out.println("===========ERROR============="+e.getMessage());
			session.getTransaction().rollback();
		}
		return cart;
	}

	public List<Cart> getCartItems(String username) {
		 Session session=sf.openSession();
	        List<Cart> cart=null;
	        try
	        {
	            session.beginTransaction();
	             
	            cart=(List<Cart>)session.createQuery("From Cart where USERMAILID='"+username+"'").list();
	            session.getTransaction().commit();
	        }
	        catch(HibernateException e)
	        {
	            session.getTransaction().rollback();
	        }
	        return cart ;
	}	
	}

