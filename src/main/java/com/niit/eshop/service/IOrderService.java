package com.niit.eshop.service;

import com.niit.eshop.model.UserOrder;

public interface IOrderService {
	
	void addOrder(UserOrder order);
    double getOrderGrandTotal(int cartId);


}
