package com.niit.eshop.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.niit.eshop.model.Category;
import com.niit.eshop.model.Product;
import com.niit.eshop.service.ICartService;
import com.niit.eshop.service.ICategoryService;
import com.niit.eshop.service.IProductService;
import com.niit.eshop.service.ISupplierService;
import com.niit.eshop.service.IUserService;
import com.niit.eshop.util.Util;

@Controller
public class ProductController 
{
	@Autowired(required = true)
	IProductService iProductService;

	@Autowired(required = true)
	ICategoryService iCategoryService;

	@Autowired(required = true)
	ICartService iCartService;
	
	@Autowired(required = true)
	IUserService iUserService;
	
	@Autowired(required=true)
	ISupplierService iSupplierService;

	int tpid = 0;

	@RequestMapping(value = { "/addproduct" })
	public ModelAndView addProduct()
	{
		System.out.println("add Product");
		return new ModelAndView("addproduct", "command", new Product()).addObject("products", iProductService.viewAllProducts()).addObject("Category",iCategoryService.viewAllCategory()).addObject("Supplier",iSupplierService.viewAllSuppliers()).addObject("stat", "Add Product");
	}

	@RequestMapping(value = { "storeproduct" })
	public ModelAndView storeProduct(HttpServletRequest request, @RequestParam("image") MultipartFile file,ModelMap model, @ModelAttribute("eshop") Product p,BindingResult result) 
	{	
		int cid=Integer.parseInt(request.getParameter("category"));
		int sid=Integer.parseInt(request.getParameter("supplier"));
		System.out.println("Store Product "+cid);
		p.setCategory(iCategoryService.editCategory(cid));
		p.setSupplier(iSupplierService.editSupplier(sid));
		String name=Util.removeComma(p.getPname());
		p.setPname(name);
		for(ObjectError o:result.getAllErrors())
		{
			iProductService.addProduct(p);
			String fileName = null,error="";
	    	if (!file.isEmpty()) 
	    	{
	            try
	            {
	                fileName = file.getOriginalFilename();
	                System.out.println(fileName);
	                byte[] bytes = file.getBytes();
	                BufferedOutputStream buffStream = new BufferedOutputStream(new FileOutputStream(new File("C:\\Users\\Digi Nxt\\Desktop\\purnima\\" + fileName)));
	                buffStream.write(bytes);
	                buffStream.close();
	                error= "You have successfully uploaded " + fileName;
	            }
	            catch (Exception e) 
	            {
	            	error="You failed to upload " + fileName + ": " + e.getMessage();
	            }
	        } 
	    	else
	    	{
	        	error="Unable to upload. File is empty.";
	        }
	    	File oldName = new File("C:\\Users\\Digi Nxt\\Desktop\\purnima\\" + fileName);
	        File newName = new File("C:\\Users\\Digi Nxt\\Desktop\\purnima\\" + p.getPname()+fileName.substring(fileName.indexOf(".")));
	        System.out.println(p.getPid());
	        if(oldName.renameTo(newName))
	        {
	           error=p.getPname()+" Profile Upload Successfully !";
	        }
	        System.out.println("product added");
		//iProductService.addProduct(p);
		}
		System.out.println("prod will add");
		return new ModelAndView("addproduct", "command", new Product()).addObject("products", iProductService.viewAllProducts()).addObject("Category",iCategoryService.viewAllCategory()).addObject("Supplier",iSupplierService.viewAllSuppliers()).addObject("stat", "Add Product");
	}
	
	@RequestMapping(value = { "/Product/storeproduct" })
	public ModelAndView updateProduct(HttpServletRequest request, @ModelAttribute("cart") Product p,BindingResult result) 
	{
		System.out.println("Store Product");
		p.setPid(tpid);
		iProductService.updateProduct(p);
		return new ModelAndView("addproduct", "command", new Product()).addObject("addproduct", iProductService.viewAllProducts());
	}

	@RequestMapping(value = { "Product/delete" })
	public String delete(HttpServletRequest request) 
	{
		String pid = request.getParameter("p");
		iProductService.deleteProduct(Integer.parseInt(pid));
		System.out.println("Delete Product");
		return "redirect:/addproduct";
		//return new ModelAndView("addproduct", "command", new Product()).addObject("products",iProductService.viewAllProducts());
	}

	@RequestMapping(value = { "/Product/edit" })
	public ModelAndView edit(HttpServletRequest request) 
	{
		System.out.println("Edit Product");
		String pid = request.getParameter("p");
		tpid = iProductService.editProduct(Integer.parseInt(pid)).getPid();
		System.out.println(tpid);
		return new ModelAndView("addproduct", "command", iProductService.editProduct(Integer.parseInt(pid))).addObject("products", iProductService.viewAllProducts()).addObject("Category",iCategoryService.viewAllCategory()).addObject("supplier",iSupplierService.viewAllSuppliers()).addObject("stat", "Edit Product");
	}
	

	@RequestMapping(value = { "moredetails" })
	public ModelAndView moredetails(HttpServletRequest request,Product p ) {
		System.out.println("moredetails");
		String pid = request.getParameter("p");
		return new ModelAndView("moredetails","p",iProductService.editProduct(Integer.parseInt(pid))).addObject("product",p);
	}
	@RequestMapping(value = { "Products" })
	public ModelAndView women(HttpServletRequest request) 
	{
		
		int cid=Integer.parseInt(request.getParameter("c"));
		Category c=iCategoryService.editCategory(cid);
		System.out.println("category "+cid);
		String jsonData="";
		//objectmapper is used 2 bring value instead of returning the total object
		ObjectMapper mapper=new ObjectMapper();
		try 
		{
			jsonData=mapper.writeValueAsString(iProductService.viewAllProducts(iCategoryService.viewCategory(cid)));
			System.out.println(jsonData);
		}
		catch (JsonGenerationException e)
		{
			e.printStackTrace();
		}
		catch (JsonMappingException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return new ModelAndView("Products").addObject("sproducts", jsonData).addObject("Products", iProductService.viewAllProducts(iCategoryService.viewCategory(cid))).addObject("Welcome",iUserService.getUser());
	}

}
	