package com.enigma.entities;

import javax.persistence.*;

@Entity
@Table(name = "mst_store")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_mst_store")
    @SequenceGenerator(name = "seq_mst_store", sequenceName = "seq_mst_store", allocationSize = 1)
    //name dari name generator, sequence namenya yg dari database
    private Integer id;

    private String storeName;
    private String adress;
    private String description;
    private String phoneNumber;

    public Store(Integer id, String storeName, String adress, String description, String phoneNumber) {
        this.id = id;
        this.storeName = storeName;
        this.adress = adress;
        this.description = description;
        this.phoneNumber = phoneNumber;
    }

    public Store() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getAddress() {
        return adress;
    }

    public void setAddress(String address) {
        this.adress = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}