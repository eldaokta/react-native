package com.enigma.service;

import com.enigma.entities.Store;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface StoreService {
    public Store save(Store store);
    public Store getStore(Integer id);
    public List<Store> getList(Store store);
    public Page<Store> getAll(Pageable pageable, Example<Store> storeExample);
    public void deleteStore(Integer id);
    public Page<Store> getStoreBySpesification(Store store, Pageable pageable);
}
