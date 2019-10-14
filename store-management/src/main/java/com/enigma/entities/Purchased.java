package com.enigma.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
@Entity
@Table(name = "mst_purchased")
public class Purchased {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String idPurchased;
    private String idProduct;
    private String idMember;
    private Integer quantity;
    private BigDecimal totalPrice;

    public String getIdPurchased() {
        return idPurchased;
    }

    public void setIdPurchased(String idPurchased) {
        this.idPurchased = idPurchased;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {

        this.totalPrice = totalPrice;
    }

    public void setPurchasePrice(BigDecimal productPrice){ //ngirim harganya ke sini, dikalian dengan quantity yg dibeli
        BigDecimal quantityDecimal = new BigDecimal (this.quantity); //konvert quentity
        this.totalPrice = productPrice.multiply(quantityDecimal);
    }
}

