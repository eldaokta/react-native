package com.enigma.service;

import com.enigma.entities.Store;
import com.enigma.repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StoreServiceImpl implements StoreService{
    @Autowired
    StoreRepository storeRepository;

    @Override
    public Store getStore(Integer id) {
        if (!storeRepository.findById(id).isPresent()){
            return new Store();
        }
        return storeRepository.findById(id).get();
    }

    @Override
    public List<Store> getAll() {
        return storeRepository.findAll();
    }

    @Override
    public void save(Store store) {
        storeRepository.save(store);
    }

}
