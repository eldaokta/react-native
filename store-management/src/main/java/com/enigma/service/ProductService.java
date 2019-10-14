package com.enigma.service;

import com.enigma.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.math.BigDecimal;
import java.util.List;

public interface ProductService {
    //untuk ngedasave data product
    public Product save(Product product);

    public Product save(Integer id, Product product);

    //untuk ngambil data satuan prduct
    public Product getProduct(String idProduct);

    //untuk nampilin semua data product
    public Page<Product> getAll(Pageable pageable);

    //untuk mengurangi quantity
    public void deduct(String idProduct, Integer quantity);

    public BigDecimal getProductPriceById(String idProduct);


    public List<Product> getAllProduct(String keyword);

    public List<Product> getProductsByStoreId(Integer id);
}
