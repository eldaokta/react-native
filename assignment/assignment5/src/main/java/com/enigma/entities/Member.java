package com.enigma.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "mst_member")
public class Member {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String idMember;
    private String name;
    private String email;
    private String address;

    @OneToMany(mappedBy = "member", cascade = CascadeType.PERSIST)
    List<Purchased> purchaseds = new ArrayList<>();


    public String getIdMember() {
        return idMember;
    }

    public void setIdMember(String idMember) {
        this.idMember = idMember;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Purchased> getPurchaseds() {
        return purchaseds;
    }

    public void setPurchaseds(List<Purchased> purchaseds) {
        this.purchaseds = purchaseds;
    }

    public Member() {
    }

    public Member(String name, String email, String address, List<Purchased> purchaseds) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.purchaseds = purchaseds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(idMember, member.idMember) &&
                Objects.equals(name, member.name) &&
                Objects.equals(email, member.email) &&
                Objects.equals(address, member.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMember, name, email, address);
    }
}
