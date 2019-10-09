package com.enigma.repositories;

import com.enigma.entities.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//sudah ada turunan crud repository didalmnya
@Repository
public interface StoreRepository extends JpaRepository<Store, Integer> {

}
