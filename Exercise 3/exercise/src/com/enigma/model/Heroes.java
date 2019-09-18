package com.enigma.model;

public class Heroes {
    Integer hp;
    Integer mana;
    Integer baseDamage;

    public Heroes(Integer hp, Integer mana, Integer baseDamage) {
        this.hp = hp;
        this.mana = mana;
        this.baseDamage = baseDamage;
    }

    public void attack(Heroes heroes){
        heroes.getHit(this.baseDamage);
    }

    public void getHit(Integer damage){
        this.hp = this.hp - damage;
    }

    public String print() {
        return "Heroes{" +
                "hp=" + hp +
                ", mana=" + mana +
                ", baseDamage=" + baseDamage +
                '}';
    }
}
