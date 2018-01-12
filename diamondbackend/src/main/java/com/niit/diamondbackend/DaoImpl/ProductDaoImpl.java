package com.niit.diamondbackend.DaoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.diamondbackend.Dao.ProductDao;
import com.niit.diamondbackend.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao 
{

	@Autowired
    SessionFactory sf;
	public ProductDaoImpl(SessionFactory sf) {
		super();
		this.sf = sf;
	}

	public ProductDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void saveProduct(Product p) 
	{
		
		Session s=sf.openSession();
		s.beginTransaction();
		s.save(p);
		s.getTransaction().commit();
		s.close();
	}

	public void updateProduct(Product p) 
	{
		Session s=sf.openSession();
		 s.beginTransaction();
		s.update(p);
		s.flush();
		s.getTransaction().commit();
		s.close();
	}

	public void deletProdudct(Product p) {
		Session s=sf.openSession();
		s.beginTransaction();
		s.delete(p);
		s.getTransaction().commit();
		s.close();
		
	}

	public List<Product> getProducts() {
		Session s=sf.openSession();
		List<Product> plist=s.createQuery("from Product").list();
		return plist;
	}

	public Product getProduct(int pid) {
		Session s=sf.openSession();
		Product p=(Product)s.get(Product.class,pid);
		return p;
	}

	public List<Product> retrieveProductByCat(int catId) {
		Session s=sf.openSession();
		List<Product> plist=s.createQuery("from Product where C_ID="+catId).list();
		return plist;
	}

}
