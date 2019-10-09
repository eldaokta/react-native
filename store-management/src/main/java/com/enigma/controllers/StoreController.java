package com.enigma.controllers;

import com.enigma.entities.Store;
import com.enigma.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //
public class StoreController {
    @Autowired
    StoreService storeService;

    @GetMapping("store/{id}")
    public Store getStoreById(@PathVariable Integer id){

        return storeService.getStore(id);
    }

    @PostMapping("/store")
    public void saveStore(@RequestBody Store store){

        storeService.save(store);
    }

    @GetMapping("/store")
    public List<Store> getAllStore(){

        return storeService.getAll();
    }
}
