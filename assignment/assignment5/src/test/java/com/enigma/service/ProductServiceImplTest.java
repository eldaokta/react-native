package com.enigma.service;

import com.enigma.entities.Product;
import com.enigma.repositories.ProductRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductService productService;

    @Before
    public void cleanUp(){
        productRepository.deleteAll();
    }

    @Test
    public void Product_save_expected_created(){
        Product expected = new Product("Lipstick", 40, new BigDecimal(55000));
        Product newProduct = new Product("Lipstick", 40, new BigDecimal(55000));
        Product saveResult = productService.save(newProduct);
        expected.setIdProduct(saveResult.getIdProduct());
        Product realResult = productRepository.findById(expected.getIdProduct()).get();
        assertEquals(expected, realResult);
    }

    @Test
    public void Product_getProductById_should_true_when_IDExists(){
        Product expected = new Product("Lipstick", 40, new BigDecimal(550.00));
        expected = productRepository.save(expected);

        Product result = productService.getProduct(expected.getIdProduct());
        assertEquals(expected, result);
    }

    @Test
    public void GetAllProduct_size_should_equals_2(){
        Product newProduct1 = new Product("Lipstick", 40, new BigDecimal(55000));
        Product newProduct2 = new Product("Mascara", 50, new BigDecimal(70000));

        productService.save(newProduct1);
        productService.save(newProduct2);

        assertEquals(2, productRepository.findAll().size());



    }
    @Test
    public void getAllProductbyName_should_return2_when_keyword_is_uri(){
        Product newProduct1 = new Product("suriken", 10, new BigDecimal(10000));
        Product newProduct2 = new Product("guriken", 10, new BigDecimal(10000));

        productRepository.save(newProduct1);
        productRepository.save(newProduct2);

        String keyword = "uri";
        List<Product> products = productService.getAllProduct(keyword);
        assertEquals(2, products.size());
    }

    @Test
    public void productQuantity_should_return_1_when_purchasedTheProduct(){
        Product newProduct1 = new Product("suriken", 2, new BigDecimal(10000));
        productRepository.save(newProduct1);
        productService.deduct(newProduct1.getIdProduct(), 2);
        Integer expectedQuantity = 1;
        assertEquals(expectedQuantity, productRepository.findById(newProduct1.getIdProduct()).get());


    }


}
