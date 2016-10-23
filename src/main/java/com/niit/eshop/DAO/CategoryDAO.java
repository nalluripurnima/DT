package com.niit.eshop.DAO;

import java.util.List;

import com.niit.eshop.model.Category;

public interface CategoryDAO {
	void addCategory(Category c);
	public List<Category> viewAllCategory();
	public void deleteCategory(int cid);
	public Category editCategory(int cid);
	public void updateCategory(Category c);
	public Category viewCategory( int cid);
	
}
