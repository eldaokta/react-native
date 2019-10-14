package com.enigma.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "mst_product")
public class Product {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String idProduct;
    private String name;
    private Integer quantity;
    private BigDecimal price;

    @ManyToOne
    @JoinColumn (name = "store_id")
    @JsonIgnore
    private Store store;

    @Transient
    private Integer storeId;

    public Product() {

    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public void deductQuantity(Integer quantity) {
        this.quantity = this.quantity - quantity;
    }


    public Product(String name, Integer quantity, BigDecimal price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(idProduct, product.idProduct) &&
                Objects.equals(name, product.name) &&
                Objects.equals(quantity, product.quantity) &&
               price.compareTo(product.getPrice())==0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProduct, name, quantity, price);
    }

    public String toString() {
        return "Product{" +
                "idProduct='" + idProduct + '\'' +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }
}
