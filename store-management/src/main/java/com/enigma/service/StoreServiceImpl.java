package com.enigma.service;

import com.enigma.entities.Store;
import com.enigma.repositories.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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


//    @Override
//    public Page<Store> getAll(Pageable pageable, String keyword) {
//        Page<Store> stores = storeRepository.findAllByStoreNameContainsOrAdressContainsOrDescriptionContainsOrPhoneNumberContains(keyword, keyword, keyword, keyword, pageable);
//        return stores;
//    }

    @Override
    public Page<Store> getAll(Pageable pageable, Example<Store> storeExample) {
        Page<Store> stores = storeRepository.findAll(storeExample, pageable);
        return stores;
    }



    @Override
    public void deleteStore(Integer id) {
        storeRepository.deleteById(id);
    }

    @Override
    public Store save(Store store) {
        storeRepository.save(store);
        return store;
    }

}
