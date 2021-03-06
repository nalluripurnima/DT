package com.niit.eshop.DAO;

import java.util.List;

import com.niit.eshop.model.Supplier;

public interface SupplierDAO {

	public void addSupplier(Supplier s);
	public List<Supplier> viewAllSuppliers();
	public void deleteSupplier(int sid);
	public void updateSupplier(Supplier s);
	public Supplier editSupplier(int sid);

}
