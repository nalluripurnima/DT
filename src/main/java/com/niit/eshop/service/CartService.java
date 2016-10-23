package com.niit.eshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.eshop.DAO.CartDAO;
import com.niit.eshop.model.Cart;


@Service("CartService")
public class CartService implements ICartService{
	
		
	@Autowired(required=true)
	private CartDAO cd;
	
	public void addToCart(Cart cart)
	{
		cd.addCart(cart);
	}

	public List<Cart> viewAllCart()
	{

		return cd.viewAllCart();
	}

	public void deleteCart(int cartid) {
			cd.deleteCart(cartid);
	}

	
	public List<Cart> getCartById(int cartId) 
	{
		return cd.getCartById(cartId);
	}

}
