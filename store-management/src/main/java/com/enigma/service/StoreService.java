package com.enigma.service;

import com.enigma.entities.Store;

import java.util.List;

public interface StoreService {
    public void save(Store store);
    public Store getStore(Integer id);
    public List<Store> getAll();

}
