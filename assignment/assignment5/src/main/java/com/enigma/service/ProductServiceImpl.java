package com.enigma.service;

import com.enigma.entities.Product;
import com.enigma.entities.Store;
import com.enigma.exception.InsufficientQuantityException;
import com.enigma.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;

    @Autowired
    StoreService storeService;

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getProduct(String idProduct) {
        if (!productRepository.findById(idProduct).isPresent()){
            return new Product();
        }
        return productRepository.findById(idProduct).get();
    }


    @Override
    public Page<Product> getAll(Pageable pageable) {
        Page <Product> products = productRepository.findAll((org.springframework.data.domain.Pageable) pageable);
        return products;
    }

    //
    @Override
    public void deduct(String idProduct, Integer quantity) {
        Product product = getProduct(idProduct);
        if (product.getQuantity()<quantity){
            throw new InsufficientQuantityException();
        }
        product.deductQuantity(quantity);
        save(product);
    }

    @Override
    public BigDecimal getProductPriceById(String idProduct) {
        return getProduct(idProduct).getPrice();
    }

    @Override
    public List<Product> getAllProduct(String keyword){
        return productRepository.findAllByNameContains(keyword);
    }

    //subresource
    @Override
    public List<Product> getProductsByStoreId(Integer id) {
        Store store = storeService.getStore(id);
        return store.getProducts();
    }

    @Override
    public Product save(Integer id, Product product){
        Store store = storeService.getStore(id);
        product.setStore(store);
        return productRepository.save(product);
    }



}
