package com.enigma.controllers;

import com.enigma.entities.Product;
import com.enigma.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("product/{idProduct}")
    public Product getProductById(@PathVariable String idProduct){
        return productService.getProduct(idProduct);
    }

    @GetMapping("/product")
    public List<Product> getAllProduct(){

        return productService.getAll();
    }

    @PostMapping("/product")
    public void saveProduct(@RequestBody Product product){
        productService.save(product);
    }

}
