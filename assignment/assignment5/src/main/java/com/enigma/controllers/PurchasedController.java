package com.enigma.controllers;

import com.enigma.entities.Member;
import com.enigma.entities.Purchased;
import com.enigma.service.PurchasedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PurchasedController {
    @Autowired
    PurchasedService purchasedService;

    @PostMapping("/purchased")
    public void savePurchased(@RequestBody Purchased purchased){
        purchasedService.purchasing(purchased);
    }

    @GetMapping("/purchased")
    public List<Purchased> getAllPurchased(){
        return purchasedService.getAll();
    }

    @DeleteMapping("purchased/{idPurchased}")
    public void deletePurchased(@PathVariable String idPurchased){
        purchasedService.deletePurchased(idPurchased);
    }


    @GetMapping("/member/{idMember}/purchased")
    public List<Purchased> getPurchasedByMemberId(@PathVariable String idMember){
        return purchasedService.getPurchasedByMemberId(idMember);
    }

}
