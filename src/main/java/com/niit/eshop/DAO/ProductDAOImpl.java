package com.niit.eshop.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.niit.eshop.model.Category;
import com.niit.eshop.model.Product;
import com.niit.eshop.model.Supplier;


@Repository("ProductDAO")
public class ProductDAOImpl implements ProductDAO{
	
	@Autowired
	private SessionFactory sf;

	@Transactional(propagation = Propagation.SUPPORTS)
	public void addProduct(Product p) {
		Session s = sf.getCurrentSession();
		Transaction t = s.beginTransaction();
		s.save(p);
		t.commit();
	}

	@Transactional(propagation = Propagation.SUPPORTS)
	public List<Product> viewAllProducts(Category cg) {
		Session s = sf.getCurrentSession();
		Transaction t = s.beginTransaction();
		Criteria c=sf.getCurrentSession().createCriteria(Product.class);
		c.add(Restrictions.eq("category", cg));
		System.out.println(cg);
		List<Product> l1 = (List<Product>) c.list();
		System.out.println("product list");
		t.commit();
		return l1;
	}
	
	@Transactional(propagation = Propagation.SUPPORTS)
	public List<Product> viewAllProducts(Supplier s1) {
		Session s=sf.getCurrentSession();
		Transaction t=s.beginTransaction();
		Criteria c=sf.getCurrentSession().createCriteria(Supplier.class);
		c.add(Restrictions.eq("supplier", s1));
		List<Product> l1=(List<Product>) c.list();
		return l1;
	}

	
	@Transactional(propagation = Propagation.SUPPORTS)
	public List<Product> viewAllProducts() {
		Session s = sf.getCurrentSession();
		Transaction t = s.beginTransaction();
		Criteria c=sf.getCurrentSession().createCriteria(Product.class);
		List<Product> l1 = (List<Product>) c.list();
		t.commit();
		return l1;
	}
	
	@Transactional(propagation = Propagation.SUPPORTS)
	public void deleteProduct(int pid)
	{
		Session s = sf.getCurrentSession();
		Transaction t = s.beginTransaction();
        Product p1=(Product) s.load(Product.class,pid);
        s.delete(p1);
		t.commit();
	}
	
	@Transactional(propagation = Propagation.SUPPORTS)
	public Product editProduct(int pid)
	{
		Session s = sf.getCurrentSession();
		Transaction t = s.beginTransaction();
		Product p=(Product)s.get(Product.class,pid);
		System.out.println(p.getPid());
		t.commit();
		return p;
	}
	
	@Transactional(propagation = Propagation.SUPPORTS)
	public Product cart(int pid)
	{
		Session s = sf.getCurrentSession();
		Transaction t = s.beginTransaction();
		Product p=(Product)s.get(Product.class,pid);
		System.out.println(p.getPid());
		t.commit();
		return p;
	}
	
	@Transactional(propagation = Propagation.SUPPORTS)
	public void updateProduct(Product p)
	{
		Session s = sf.getCurrentSession();
		Transaction t = s.beginTransaction();
		s.update(p);
		t.commit();
	}
}
