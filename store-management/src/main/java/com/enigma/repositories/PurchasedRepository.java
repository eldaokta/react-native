package com.enigma.repositories;

import com.enigma.entities.Purchased;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchasedRepository extends JpaRepository<Purchased, String> {

}
