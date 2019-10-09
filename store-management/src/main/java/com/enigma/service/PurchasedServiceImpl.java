package com.enigma.service;

import com.enigma.entities.Product;
import com.enigma.entities.Purchased;
import com.enigma.repositories.PurchasedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchasedServiceImpl implements PurchasedService{
    @Autowired
    PurchasedRepository purchasedRepository;

    @Autowired
    ProductService productService;

    @Override
    public void purchasing(Purchased purchased) {
        productService.deduct(purchased.getIdProduct(), purchased.getQuantity());
        purchased.setPurchasePrice(productService.getProductPriceById(purchased.getIdProduct()));
        purchasedRepository.save(purchased);

    }


}
