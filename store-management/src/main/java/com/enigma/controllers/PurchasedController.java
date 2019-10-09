package com.enigma.controllers;

import com.enigma.entities.Purchased;
import com.enigma.service.PurchasedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PurchasedController {
    @Autowired
    PurchasedService purchasedService;

    @PostMapping("/purchased")
    public void savePurchased(@RequestBody Purchased purchased){
        purchasedService.purchasing(purchased);
    }


}
