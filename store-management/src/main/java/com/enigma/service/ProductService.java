package com.enigma.service;

import com.enigma.entities.Product;

import java.math.BigDecimal;
import java.util.List;

public interface ProductService {
    //untuk ngedasave data product
    public void save(Product product);

    //untuk ngambil data satuan prduct
    public Product getProduct(String idProduct);

    //untuk nampilin semua data product
    public List<Product> getAll();

    //untuk mengurangi quantity
    public void deduct(String idProduct, Integer quantity);

    public BigDecimal getProductPriceById(String idProduct);
}
