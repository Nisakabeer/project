package com.niit.diamondbackend.DaoImpl;

import java.util.*;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.diamondbackend.Dao.SupplierDao;
import com.niit.diamondbackend.model.Category;
import com.niit.diamondbackend.model.Supplier;

@Repository
public class SupplierDaoImpl implements SupplierDao 
{

	@Autowired
    SessionFactory sf;

	public SupplierDaoImpl(SessionFactory sf) {
		super();
		this.sf = sf;
	}

	
	public SupplierDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void saveSupplier(Supplier s)
	{
		Session s1=sf.openSession();
		s1.beginTransaction();
		s1.save(s);
		s1.getTransaction().commit();
		s1.close();
		
	}

	public void updateSupplier(Supplier s) {
		Session s1=sf.openSession();
		 s1.beginTransaction();
		s1.update(s);
		s1.flush();
		s1.getTransaction().commit();
		s1.close();
		
	}

	public void deletSupplier(Supplier s) {
		Session s1=sf.openSession();
		s1.beginTransaction();
		s1.delete(s);
		s1.getTransaction().commit();
		s1.close();
		
	}

	public List<Supplier> getSuppliers() 
	{
		Session s1=sf.openSession();
		
		List<Supplier> slist=s1.createQuery("from Supplier").list();
		return slist;
		
		
		
		
	}

	public Supplier getSupplier(int sid) {

         Session s1=sf.openSession();
		
		Supplier s=(Supplier)s1.get(Supplier.class, sid);
	
		return s;
	}
	
}
