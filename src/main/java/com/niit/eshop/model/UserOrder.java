package com.niit.eshop.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class UserOrder {

	@Id
	private Integer orderId;
	
	/*@OneToMany
    @JoinColumn(name = "cartId")
    private List<Cart> Cart;*/

	
	@OneToOne
	@JoinColumn(name="User")
	private User user;
	
	/*@OneToOne
	@JoinColumn(name="Cart")
	private Cart cart;*/
	
	@OneToOne
	@JoinColumn(name="ShippingAddress")
	private ShippingAddress shippingAddress;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	/*public List<Cart> getCart() {
		return Cart;
	}

	public void setCart(List<Cart> cart) {
		Cart = cart;
	}*/

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	
}
