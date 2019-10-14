package com.enigma.controllers;

import com.enigma.entities.Store;
import com.enigma.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
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

//    @GetMapping("/stores")
//    public Page<Store> getAllStore(@RequestParam Integer size, @RequestParam Integer page, @RequestParam String keyword){
//        Pageable pageable = PageRequest.of(size, page);
//        return storeService.getAll(pageable, keyword);
//    }

    @GetMapping("/stores")
    public Page<Store> getAllStore(@RequestParam Integer size, @RequestParam Integer page, @RequestBody Store search){
        ExampleMatcher exampleMatcher = ExampleMatcher.matchingAny().
                withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
        Example<Store> storeExample = Example.of(search, exampleMatcher);

        Pageable pageable = PageRequest.of(page, size);
        return storeService.getAll(pageable, storeExample);
    }


    @DeleteMapping("store/{id}")
    public void deleteStore(@PathVariable Integer id){
        storeService.deleteStore(id);
    }

}
