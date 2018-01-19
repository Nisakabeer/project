package com.niit.diamondbackend.DaoImpl;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.diamondbackend.Dao.OrderDao;
import com.niit.diamondbackend.model.Order;

@Repository
public class OrderDaoImpl implements OrderDao
{
	 @Autowired
	 SessionFactory sf;
	 
	 
	public OrderDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}


	public OrderDaoImpl(SessionFactory sf) {
		super();
		this.sf = sf;
	}


	@Transactional
	public boolean addOrders(Order order)
	{
		
		 try
	        {
	            sf.getCurrentSession().save(order);
	            return true;
	        }
	        catch(Exception e)
	        {
	            return false;
	        }
	}
}
