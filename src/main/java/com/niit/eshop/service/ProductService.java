package com.niit.eshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.eshop.DAO.ProductDAO;
import com.niit.eshop.model.Category;
import com.niit.eshop.model.Product;
import com.niit.eshop.model.Supplier;


@Service("ProductService")
public class ProductService implements IProductService{
	
	@Autowired(required=true)
	private ProductDAO pd;
	
	public void addProduct(Product p) {
		pd.addProduct(p);
	}
	
	public List<Product> viewAllProducts(Category c) {
		return pd.viewAllProducts(c);
	}
	
	public List<Product> viewAllProducts(Supplier s) {
		return pd.viewAllProducts(s);
	}

	
	public List<Product> viewAllProducts() {
		return pd.viewAllProducts();
	}
	
	public void deleteProduct(int pid){
		pd.deleteProduct(pid);
	}
	public void updateProduct(Product p){
		 pd.updateProduct(p);
	}
	
	public Product editProduct(int pid){
		return pd.editProduct(pid);
	}

	public Product cart(int pid) {
		
		return pd.cart(pid);
	}
}
