package com.enigma.service;

import com.enigma.entities.Purchased;

import java.util.List;

public interface PurchasedService {
    //untuk menyimpan pengurangan
    public Purchased purchasing(Purchased purchased);

    public List<Purchased> getAll();

    public void deletePurchased(String idPurchased);

//    public Member getPurchasedByMemberId(String idMember, Purchased purchased);

    public List<Purchased> getPurchasedByMemberId(String idMember);

}
