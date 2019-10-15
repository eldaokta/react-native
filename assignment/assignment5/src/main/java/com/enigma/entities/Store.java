package com.enigma.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    @OneToMany(mappedBy = "store", cascade = CascadeType.PERSIST)
    List<Product> products = new ArrayList<>();


    public Store( String storeName, String adress, String description, String phoneNumber) {
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Store store = (Store) o;
        return Objects.equals(id, store.id) &&
                Objects.equals(storeName, store.storeName) &&
                Objects.equals(adress, store.adress) &&
                Objects.equals(description, store.description) &&
                Objects.equals(phoneNumber, store.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, storeName, adress, description, phoneNumber);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
