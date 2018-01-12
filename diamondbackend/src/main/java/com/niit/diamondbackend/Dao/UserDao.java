package com.niit.diamondbackend.Dao;

import com.niit.diamondbackend.model.User;

public interface UserDao
{
	void saveUser(User u);
	
	User getUser(String mail);

}
