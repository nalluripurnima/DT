package com.niit.eshop.DAO;

import java.util.List;

import com.niit.eshop.model.Cart;

public interface CartDAO {

	
	public List<Cart> viewAllCart();
	public void deleteCart(int cid);
	public void addCart(Cart cart);
	public List<Cart> getCartById(int cartId);
	
}
	
