package com.niit.eshop.DAO;



import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.niit.eshop.DAO.UserDAO;
import com.niit.eshop.model.UserRole;
import com.niit.eshop.model.User;

@Repository("UserDAO")
public class UserDAOImpl implements UserDAO 
{
	User user;

	@Autowired
	private SessionFactory sf;

	@Transactional(propagation = Propagation.SUPPORTS)
	public void addUser(User u)
	{
		Session s = sf.getCurrentSession();
		Transaction t = s.beginTransaction();
		System.out.println("new user");
		s.saveOrUpdate(u);
		UserRole r=new UserRole();
		System.out.println("userid");
		r.setUser_role_id(u.getUid());
		System.out.println("roleuserid");
		r.setAuthority("ROLE_USER");
		System.out.println("user name");
		s.saveOrUpdate(r);
		t.commit();
		
	}
	@Transactional(propagation = Propagation.SUPPORTS)
	public User verify(User u)
	{
		Session s = sf.getCurrentSession();
		Transaction t = s.beginTransaction();
		Criteria c=s.createCriteria(User.class);
		System.out.println(u.getMail());
		System.out.println(u.getPwd());
		c.add(Restrictions.eq("mail",u.getMail()));
		c.add(Restrictions.eq("pwd",u.getPwd()));
		System.out.println("name pwd");
		user=(User) c.uniqueResult();
		System.out.println(user.getFirstname());
		System.out.println(getUser());
		t.commit();
		return user;
	}

    
	@Transactional(propagation = Propagation.SUPPORTS)
	public User getUser()
	{
		return user;
	}
	
	@Transactional(propagation = Propagation.SUPPORTS)
	public User editUser(int uid)
	{
		Session s = sf.getCurrentSession();
		Transaction t = s.beginTransaction();
		user=(User)s.get(User.class,uid);
		System.out.println(user.getUid());
		t.commit();
		return user;
	}
	
}
