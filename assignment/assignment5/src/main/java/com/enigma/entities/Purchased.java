package com.enigma.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "mst_purchased")
public class Purchased {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String idPurchased;
    private BigDecimal total;

    //yg ngesave idMember yg dibawah
    @ManyToOne
    @JoinColumn (name = "id_member")
    @JsonIgnore
    private Member member;

    //cuma tempat nampung sementara
    @Transient
    private String idMember;


    @OneToMany(mappedBy = "purchased", cascade = CascadeType.PERSIST)
    List<PurchasedDetail> purchasedDetails = new ArrayList<>();

    public String getIdPurchased() {
        return idPurchased;
    }

    public void setIdPurchased(String idPurchased) {
        this.idPurchased = idPurchased;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }


    public String getIdMember() {
        return idMember;
    }

    public void setIdMember(String idMember) {
        this.idMember = idMember;
    }

    public List<PurchasedDetail> getPurchasedDetails() {
        return purchasedDetails;
    }

    public void setPurchasedDetails(List<PurchasedDetail> purchasedDetails) {
        this.purchasedDetails = purchasedDetails;
    }

    public Purchased() {
    }

    public Purchased(BigDecimal total, Member member, String idMember, List<PurchasedDetail> purchasedDetails) {
        this.total = total;
        this.member = member;
        this.idMember = idMember;
        this.purchasedDetails = purchasedDetails;
    }



    //    public void setPurchasePrice(BigDecimal productPrice){ //ngirim harganya ke sini, dikalian dengan quantity yg dibeli
//        BigDecimal quantityDecimal = new BigDecimal (this.quantity); //konvert quentity
//        this.totalPrice = productPrice.multiply(quantityDecimal);
//    }
}

