package com.niit.eshop.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.eshop.model.Cart;
import com.niit.eshop.model.User;
import com.niit.eshop.model.UserOrder;
import com.niit.eshop.service.ICartService;
import com.niit.eshop.service.IOrderService;
import com.niit.eshop.service.IUserService;

public class OrderController {

	
	@Autowired
	ICartService iCartService;
	
	@Autowired
	IOrderService  iOrderService;
	
	@Autowired
	IUserService iUserService;

	@RequestMapping(value = { "cart/order" })
	public String check(HttpServletRequest request,String c)
	{
		System.out.println("order");
		UserOrder order=new UserOrder();
		String car=request.getParameter("c");
		System.out.println("yup"+car);
		int cid= Integer.parseInt(car);
		System.out.println("yes");
		List<Cart> cart=iCartService.getCartById(cid);
		System.out.println(cart);
		System.out.println("cart");
		System.out.println("jhgfdv");
		order.setCart(cart);
		User user=null;
		for(Cart ct:cart){
			user=ct.getUser();
		}
		order.setUser(user);
		//order.setShippingAddress(user.getShippingAddress());
		System.out.println("ship");
		iOrderService.addOrder(order);
		System.out.println("ord");
        user.getUid();
		return "redirect:buy";
		}

	
}
