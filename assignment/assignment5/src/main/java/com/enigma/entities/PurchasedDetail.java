package com.enigma.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "purchased_detail")
public class PurchasedDetail {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;
    @ManyToOne
    @JoinColumn(name = "id_purchased")
    @JsonIgnore
    private Purchased purchased;
    //boleh ditulis, tapi oneToMany
    @ManyToOne
    @JoinColumn(name = "id_product")
    @JsonIgnore
    private Product product;
    private Integer quantity;
    private BigDecimal subTotal;

    @Transient
    private String idProduct;

    public PurchasedDetail() {
    }

    public PurchasedDetail(Purchased purchased, Product product, Integer quantity, BigDecimal subTotal, String idProduct) {
        this.purchased = purchased;
        this.product = product;
        this.quantity = quantity;
        this.subTotal = subTotal;
        this.idProduct = idProduct;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Purchased getPurchased() {
        return purchased;
    }

    public void setPurchased(Purchased purchased) {
        this.purchased = purchased;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }
}
