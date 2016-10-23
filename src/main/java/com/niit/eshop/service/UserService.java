package com.niit.eshop.service;

import com.niit.eshop.DAO.UserDAO;
import com.niit.eshop.model.User;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserService implements IUserService {


	@Autowired(required=true)
	private UserDAO cd;
	
	public void addUser(User u) {
		cd.addUser(u);
	}
	public User verify(User u){
		/*User user=cd.verify(u);
		System.out.println(user.getFirstname());*/
		return cd.verify(u);
	}
	
	public User getUser(){
		return cd.getUser();
	}
	public void deleteUser(User u) {
		// TODO Auto-generated method stub
		
	}
		
}
