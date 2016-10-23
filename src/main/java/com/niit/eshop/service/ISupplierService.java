package com.niit.eshop.service;

import java.util.List;

import com.niit.eshop.model.Supplier;

public interface ISupplierService {

	public void addSupplier(Supplier s);
	public List<Supplier> viewAllSuppliers();
	public void deleteSupplier(int sid);
	public void updateSupplier(Supplier s);
	public Supplier editSupplier(int sid);

}
