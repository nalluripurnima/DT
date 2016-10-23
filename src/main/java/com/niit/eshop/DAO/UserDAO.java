package com.niit.eshop.DAO;

import com.niit.eshop.model.User;

public interface UserDAO {
	public void addUser(User u);
	public User verify(User u);
	public User getUser();
	
	
}

