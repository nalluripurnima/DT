package com.niit.eshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.web.multipart.MultipartFile;

@Entity
public class Product {	
	
	@ManyToOne
	@JoinColumn(name="Category",nullable = false)
	private Category category;
	
	@ManyToOne
	@JoinColumn(name="Supplier",nullable = false)
	private Supplier supplier;
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer pid;
	
	@Column
	@Size(min=4,max=20,message="Product Name must have min of 4 and max of 20 Characters")
	private String pname;
	
	@Column
	@Size(min=6,max=20,message="Product Name must have min of 6 and max of 20 Characters")
	private String desc;
	
	@Column
	@NotNull
	private double price;
	
	@Transient
	private MultipartFile image;

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}
	
	
	
}

	