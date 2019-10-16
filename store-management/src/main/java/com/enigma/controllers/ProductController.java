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

    //select satu data
    @GetMapping("product/{idProduct}")
    public Product getProductById(@PathVariable String idProduct){
        return productService.getProduct(idProduct);
    }

   //select *
    @GetMapping("/products")
    public Page<Product> getAllProducts(@RequestParam Integer size, @RequestParam Integer page){
        PageRequest pageable = PageRequest.of(size, page);
        return productService.getAll(pageable);

    }

    //save data
    @PostMapping("/product")
    public void saveProduct(@RequestBody Product product){
        productService.save(product.getStoreId(), product);
    }

    //subresources
    @GetMapping("/store/{id}/products")
    public List<Product> getProductByStoreId(@PathVariable Integer id){
        return productService.getProductsByStoreId(id);
    }

    //subresources
    @PostMapping("/store/{id}/product")
    public Product getProductByStoreId(@PathVariable Integer id, @RequestBody Product product){
        return productService.save(id, product);
    }

    @GetMapping("/products/{name}")
    public List<Product> getProductByName(@PathVariable String name){
        return productService.getAllProduct(name);
    }


    @DeleteMapping("product/{id}")
    public void deleteProduct(@PathVariable String idProduct){

    }

}
