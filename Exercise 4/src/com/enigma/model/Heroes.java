package com.enigma.model;

public class Heroes {
    Integer hp;
    Integer damage;
    Integer heal;

    //custructur
    public Heroes(Integer hp, Integer damage, Integer heal){
        this.hp = hp;
        this.damage = damage;
        this.heal = heal;
    }
    //kena serangan, berarti berkurangnya hp
    public void getHit(Integer damage){
        this.hp = this.hp - damage;
    }

    //method interaksi antar objek. menyerang, berarti memanggil getHit
    public void attack(Heroes heroes){
        heroes.getHit(this.damage);
    }
    // kena sembuhan, berarti nambah hp
    public void getHeal(Integer heal){
        this.hp = this.hp + heal;
    }

    //interaksi antar objectnya
    public void healing(Heroes heroes){
        heroes.getHeal(heal);
    }

    public String print() {
        return "Heroes{" +
                "hp=" + hp +
                ", damage=" + damage +
                '}';
    }
}