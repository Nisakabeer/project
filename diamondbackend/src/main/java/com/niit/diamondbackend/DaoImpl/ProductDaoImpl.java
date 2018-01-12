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

	public void updateProduct(Product p) {
		// TODO Auto-generated method stub
		
	}

	public void deletProdudct(Product p) {
		// TODO Auto-generated method stub
		
	}

	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	public Product getProduct(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> retrieveProductByCat(int catId) {
		// TODO Auto-generated method stub
		return null;
	}

}
