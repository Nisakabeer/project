package com.niit.diamondbackend.DaoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.diamondbackend.Dao.CategoryDao;
import com.niit.diamondbackend.model.Category;
import com.niit.diamondbackend.model.Supplier;

@Repository
@EnableTransactionManagement
public class CategoryDaoImpl implements CategoryDao
{

	@Autowired
    SessionFactory sf;
	
	public CategoryDaoImpl(SessionFactory sf) {
		super();
		this.sf = sf;
	}
	

	public CategoryDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void saveCategory(Category c) {
		
		Session s=sf.openSession();
		s.beginTransaction();
		s.persist(c);
		s.getTransaction().commit();
		s.close();
	}

	@Transactional
	public void updateCategory(Category c) {
		Session s=sf.getCurrentSession();
		 
		s.update(c);
		
		s.close();
		
	}


	public void deleteCategory(Category c) {
		Session s=sf.openSession();
		s.beginTransaction();
		s.delete(c);
		s.getTransaction().commit();
		s.close();

		
	}

	public List<Category> getCategorys() {
              Session s=sf.openSession();
		
		List<Category> clist=s.createQuery("from Category").list();
		return clist;
		
		
	}

	public Category getCategory(int cId) {
		Session s=sf.openSession();
		
		Category c=(Category)s.get(Category.class, cId);
	
		return c;
	}

}
