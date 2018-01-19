package com.niit.diamondbackend.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Product 
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int pid;
	private String pname;
	private String description;
	private double price;
	private int stock;
	
	
	@OneToMany(targetEntity=Cart.class,mappedBy="product")
	private Set<Cart> cart;
	
	public Set<Cart> getCart() {
		return cart;
	}
	public void setCart(Set<Cart> cart) {
		this.cart = cart;
	}
	@ManyToOne
	@JoinColumn(name="S_ID")
	private Supplier supplier;
	
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@ManyToOne
	@JoinColumn(name="C_ID")
	private Category category;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
}
