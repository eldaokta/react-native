package com.enigma.service;

import com.enigma.entities.Product;
import com.enigma.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public Product getProduct(String idProduct) {
        if (!productRepository.findById(idProduct).isPresent()){
            return new Product();
        }
        return productRepository.findById(idProduct).get();
    }


    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    //
    @Override
    public void deduct(String idProduct, Integer quantity) {
        Product product = getProduct(idProduct);
        product.deductQuantity(quantity);
        save(product);
    }

    @Override
    public BigDecimal getProductPriceById(String idProduct) {
        return getProduct(idProduct).getPrice();
    }


}
