package com.niit.eshop.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.eshop.model.Cart;
import com.niit.eshop.model.Product;
import com.niit.eshop.service.ICartService;
import com.niit.eshop.service.IProductService;
import com.niit.eshop.service.IUserService;

@Controller
public class CartController {
	                             
	@Autowired(required=true)
	ICartService iCartService;
	
	@Autowired(required=true)
	IProductService iProductService;
	
	@Autowired(required=true)
	IUserService iUserService;
	@RequestMapping(value = { "/cart" })
	public ModelAndView addCart()
	{
		System.out.println("add cart");
		return new ModelAndView("cart").addObject("cart",iCartService.viewAllCart());
	}
	
	@RequestMapping(value = { "viewcart" })
	public ModelAndView cart(HttpServletRequest request, @ModelAttribute("eshop") Product p,BindingResult result) {
		System.out.println("View Cart");
		return new ModelAndView("cart").addObject("cart",iCartService.viewAllCart());
	}
	
	@RequestMapping(value = { "/storecart" })
	public ModelAndView addcart(HttpServletRequest request, @ModelAttribute("eshop") Product p,BindingResult result) {
		System.out.println("Store Cart");
		String pid = request.getParameter("p");
		Cart c=new Cart();
		c.setProduct(iProductService.editProduct(Integer.parseInt(pid)));
		c.setQuantity(1);
		System.out.print("adding to cart "+iUserService.getUser());
		c.setUser(iUserService.getUser());
		iCartService.addToCart(c);
		return new ModelAndView("cart", "cartItem",c).addObject("cart",iCartService.viewAllCart());
	}
	
	@RequestMapping(value = { "cart/delete" })
	public String delete(HttpServletRequest request) 
	{
		String cartid = request.getParameter("c");
		iCartService.deleteCart(Integer.parseInt(cartid));
		System.out.println("Delete Product");
		iCartService.viewAllCart();
		return "redirect:/cart";
		//return new ModelAndView("cart", "command", new Cart()).addObject("cart",iCartService.viewAllCart());
	}
	
	@RequestMapping(value = { "cart/check" })
	public ModelAndView check(HttpServletRequest request)
	{
		String cartid = request.getParameter("c");
		iCartService.deleteCart(Integer.parseInt(cartid));
		System.out.println("Check Product");
		return new ModelAndView("buy");
	}
	
	@RequestMapping(value = { "cart/continue" })
	public ModelAndView cont(HttpServletRequest request) 
	{
		System.out.println("Continue");
		return new ModelAndView("index").addObject("continue",true);
	}
}