package com.enigma.repositories;

import com.enigma.entities.Store;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

//sudah ada turunan crud repository didalmnya
@Repository
public interface StoreRepository extends JpaRepository<Store, Integer>, JpaSpecificationExecutor<Store>{
    Page<Store> findAllByStoreNameContainsOrAdressContainsOrDescriptionContainsOrPhoneNumberContains(String name, String adress, String description, String phoneNumber, Pageable pageable);


}
