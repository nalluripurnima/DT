package com.niit.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.eshop.model.User;
import com.niit.eshop.service.ICategoryService;
import com.niit.eshop.service.IProductService;
import com.niit.eshop.service.IUserService;


@Controller
public class HomeController {	
	
	@Autowired
	ICategoryService iCategoryService;
	
	@Autowired
	IProductService iProductService;

	@Autowired
	IUserService iUserService;
	
	@RequestMapping(value = { "/" ,"index","logout"})
	public ModelAndView index() {
		System.out.println("index");
		return new ModelAndView("index");
	}
	@RequestMapping(value = { "home" })
	public ModelAndView home() {
		System.out.println("home");
		return new ModelAndView("home").addObject("Categorys",iCategoryService.viewAllCategory());
	}
	@RequestMapping(value = { "register" })
	public ModelAndView register() {
		System.out.println("register here");
		return new ModelAndView("home","command",new User()).addObject("register", true);
	}
	
	@RequestMapping(value = { "login" })
	public ModelAndView Login() {
		System.out.println("Login");
		return new ModelAndView("home","command",new User()).addObject("login", true);
	}
	
	@RequestMapping(value = { "about" })
	public ModelAndView about() {
		System.out.println("about");
		return new ModelAndView("about");
	}
	
	@RequestMapping(value = { "contact" })
	public ModelAndView contact() {
		System.out.println("contact");
		return new ModelAndView("contact");
	}
	
	
    		
	@RequestMapping(value = { "/accessdenied" })
	public ModelAndView error() {
		System.out.println("error");
		return new ModelAndView("error");
	}
	
	@RequestMapping(value = { "adminpg" })
	public ModelAndView adminpg() {
		System.out.println("adminpage");
		return new ModelAndView("adminpg","command",new User());
		}
	
		
	@RequestMapping(value = { "buy" })
	public ModelAndView buy() {
		System.out.println("buy");
		return new ModelAndView("buy");
	}
	
	@RequestMapping(value = { "conform" })
	public ModelAndView confirm() {
		System.out.println("confirm");
		return new ModelAndView("conform");
	}
	
	
	@RequestMapping(value = { "logout" })
	public ModelAndView logout() {
		System.out.println("logout");
		return new ModelAndView("logout");
	}
	
	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public ModelAndView adminPage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", "This is protected page - Admin Page!");
		model.setViewName("admin");

		return model;

	}

}
