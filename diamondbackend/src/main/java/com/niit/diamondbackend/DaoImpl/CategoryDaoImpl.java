package com.niit.diamondbackend.DaoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.diamondbackend.Dao.CategoryDao;
import com.niit.diamondbackend.model.Category;

@Repository
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
		s.save(c);
		s.getTransaction().commit();
		s.close();
	}

	public void updateCategory(Category c) {
		// TODO Auto-generated method stub
		
	}

	public void deleteCategory(Category c) {
		// TODO Auto-generated method stub
		
	}

	public List<Category> getCategorys() {
		// TODO Auto-generated method stub
		return null;
	}

	public Category getCategory(int cId) {
		// TODO Auto-generated method stub
		return null;
	}

}
