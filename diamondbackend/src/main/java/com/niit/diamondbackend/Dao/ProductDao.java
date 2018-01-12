package com.niit.diamondbackend.Dao;

import java.util.List;

import com.niit.diamondbackend.model.Product;

public interface ProductDao 
{
	void saveProduct(Product p);
	void updateProduct(Product p);
	void deletProdudct(Product p);
	List<Product> getProducts();
	Product getProduct(int pid);
	List<Product> retrieveProductByCat(int catId);
	

}
