package com.niit.diamondbackend.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class User
{
	
	private String name;
	@Id
	private String mail;
	private String password;
	private long phoneno;
	private String address;
	
	@OneToMany(targetEntity=Cart.class,mappedBy="user")
	private Set<Cart> cart;
	
	public Set<Cart> getCart() {
		return cart;
	}
	public void setCart(Set<Cart> cart) {
		this.cart = cart;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	private String role;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	

}
