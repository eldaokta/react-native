package com.enigma.service;

import com.enigma.entities.Store;
import com.enigma.repositories.StoreRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StoreServiceImplTest {

    @Autowired
    StoreRepository storeRepository;

    @Autowired
    StoreService storeService;

    @Before
    public void cleanUp(){
        storeRepository.deleteAll();
    }

    @Test
    public void Store_save_expected_created(){
        Store expected = new Store("Another Store", "Jl.Ninja", "kami menjual suriken second", "081317181920");
        expected = storeRepository.save(expected);
        Store realResult = storeRepository.findById(expected.getId()).get();
        assertEquals(expected, realResult);
    }

    @Test
    public void Store_getAllProduct_should_true_whenSizeEquals_2(){
        Store newStore1 = new Store("Another Store", "Jl.Ninja", "kami menjual suriken second", "081317181920");
        Store newStore2 = new Store("Another Store1", "Jl.Ninja", "kami menjual suriken second", "081317181920");

        storeService.save(newStore1);
        storeService.save(newStore2);

        assertEquals(2, storeRepository.findAll().size());
    }

    @Test
    public void Store_getStoreById_should_true_when_IDExist(){
        Store expected = new Store("Another Store", "Jl.Ninja", "kami menjual suriken second", "081317181920");
        expected = storeRepository.save(expected);

        Store result = storeRepository.findById(expected.getId()).get();
        assertEquals(expected, result);
    }

//    @Test
//    public void deleteStore(){
//        Store expected = new Store("Another Store", "Jl.Ninja", "kami menjual suriken second", "081317181920");
//        expected = storeService.save(expected);
//        storeService.deleteStore(storeRepository.findById(expected.getId()).get().getId());
//        assertEquals(0, storeService.getAll().size());
//    }


}
