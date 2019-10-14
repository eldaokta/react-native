package com.enigma.controllers;

import com.enigma.entities.Product;
import com.enigma.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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

    @GetMapping("/products")
    public Page<Product> getAllProducts(@RequestParam Integer size, @RequestParam Integer page){
        PageRequest pageable = PageRequest.of(page, size);
        return productService.getAll(pageable);

    }

    @PostMapping("/product")
    public void saveProduct(@RequestBody Product product){
        productService.save(product.getStoreId(), product);
    }

    @PostMapping("/store/{id}/product")
    public Product getProductByStoreId(@PathVariable Integer id, @RequestBody Product product){
        return productService.save(id, product);
    }

    @GetMapping("/products/{name}")
    public List<Product> getProductByName(@PathVariable String name){
        return productService.getAllProduct(name);
    }

    @GetMapping("/store/{id}/products")
    public List<Product> getProductByStoreId(@PathVariable Integer id){
        return productService.getProductsByStoreId(id);
    }

    @DeleteMapping("product/{id}")
    public void deleteProduct(@PathVariable String idProduct){

    }

}
