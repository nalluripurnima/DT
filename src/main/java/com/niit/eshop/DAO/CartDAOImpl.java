package com.niit.eshop.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.niit.eshop.model.Cart;


@Repository("CartDAO")
public class CartDAOImpl implements CartDAO{
	
	@Autowired
	private SessionFactory sf;

	@Transactional(propagation = Propagation.SUPPORTS)
	public List<Cart> viewAllCart() {
		Session s = sf.getCurrentSession();
		Transaction t = s.beginTransaction();
		System.out.println("hjghygf");
		@SuppressWarnings("unchecked")
		List<Cart> l1 = (List<Cart>) sf.getCurrentSession().createCriteria(Cart.class).list();
		System.out.println("sjbdcsdhcb ");
		t.commit();
		return l1;
	}
	
	@Transactional(propagation = Propagation.SUPPORTS)
	public void deleteCart(int cartid)
	{
		Session s = sf.getCurrentSession();
		Transaction t = s.beginTransaction();
        Cart c1=(Cart) s.load(Cart.class,cartid);
        s.delete(c1);
		t.commit();
	}
	@Transactional(propagation = Propagation.SUPPORTS)
	public void addCart(Cart cart) {
		Session s = sf.getCurrentSession();
		Transaction t = s.beginTransaction();
		System.out.println("hbjebe");
		s.save(cart);
		System.out.println("uyvcewhxqu");
		t.commit();
	}
	@Transactional(propagation = Propagation.SUPPORTS)
	public List<Cart> getCartById(int cartId) 
	{
		Session s = sf.getCurrentSession();
		Transaction t = s.beginTransaction();
		List<Cart> l1=(List<Cart>)sf.getCurrentSession().createCriteria(Cart.class).list();
		//Cart c=(Cart)s.get(Cart.class,cartId);
	    System.out.println("getCart by id is called after transaction"+l1);
	    t.commit();
	    return l1;
	}

	
}
