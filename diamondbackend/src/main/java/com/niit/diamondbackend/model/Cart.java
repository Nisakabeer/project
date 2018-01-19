
package com.niit.diamondbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Cart
{
	 @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
    private int cartid;
    private int cartqnty;
    
    @ManyToOne
	@JoinColumn(name="USERMAILID")
	private User user;
    
    @ManyToOne
	@JoinColumn(name="PRODUCT_ID")
	private Product product;
    
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	public int getCartqnty() {
		return cartqnty;
	}
	public void setCartqnty(int cartqnty) {
		this.cartqnty = cartqnty;
	}
    
}

