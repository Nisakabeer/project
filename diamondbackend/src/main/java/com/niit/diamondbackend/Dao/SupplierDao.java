package com.niit.diamondbackend.Dao;

import java.util.List;

import com.niit.diamondbackend.model.Supplier;

public interface SupplierDao 
{
void saveSupplier(Supplier s);
void updateSupplier(Supplier s);
void deletSupplier(Supplier s);
List<Supplier> getSuppliers();
Supplier getSupplier(int sid);


}
