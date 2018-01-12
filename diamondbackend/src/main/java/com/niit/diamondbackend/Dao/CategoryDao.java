package com.niit.diamondbackend.Dao;

import java.util.List;

import com.niit.diamondbackend.model.Category;

public interface CategoryDao
{
		
void saveCategory(Category c);
void updateCategory(Category c);
void deleteCategory(Category c);
List<Category> getCategorys();
Category getCategory(int cid);

}
