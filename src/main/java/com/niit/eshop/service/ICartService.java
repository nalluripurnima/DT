package com.niit.eshop.service;

import java.util.List;

import com.niit.eshop.model.Cart;

public interface ICartService {

	public List<Cart> viewAllCart();
	public void deleteCart(int cartid);
	public void addToCart(Cart c);
	public List<Cart> getCartById(int cartId);
	
}
