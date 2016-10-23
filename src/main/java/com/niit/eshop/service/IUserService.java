package com.niit.eshop.service;

import com.niit.eshop.model.User;

public interface IUserService {
	void addUser(User u);
    User verify(User u);
    public User getUser();
	public void deleteUser(User u);
}
