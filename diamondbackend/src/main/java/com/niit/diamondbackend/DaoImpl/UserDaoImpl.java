package com.niit.diamondbackend.DaoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.diamondbackend.Dao.UserDao;
import com.niit.diamondbackend.model.User;

@Repository
public class UserDaoImpl implements UserDao
{
      public UserDaoImpl() {
		super();
		
	}

	@Autowired
      SessionFactory sf;

	public UserDaoImpl(SessionFactory sf) {
		super();
		this.sf = sf;
	}

	public void saveUser(User u) 
	{
		Session s=sf.openSession();
		s.beginTransaction();
		s.save(u);
		s.getTransaction().commit();
		s.close();
		
	}

	public User getUser(String mail) {
		// TODO Auto-generated method stub
		return null;
	}
      
}
