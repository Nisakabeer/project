
package com.niit.diamondbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Cart
{
	 @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
    private int cartid;
    private int cartqnty;
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

